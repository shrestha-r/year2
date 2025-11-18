from itertools import permutations

def graph_edit_distance_with_ops(G, Q):
    """
    Compute a simple Graph Edit Distance (GED) between small graphs G and Q.
    Returns the minimum edit cost and the list of operations.
    G and Q are dicts: {'nodes': [...], 'edges': [(a,b), (b,c), ...]}.
    """

    # Extract nodes and edges from both graphs
    nodes_G = G['nodes']
    nodes_Q = Q['nodes']
    edges_G = set([tuple(sorted(e)) for e in G['edges']])  # undirected edges
    edges_Q = set([tuple(sorted(e)) for e in Q['edges']])

    # Store graph sizes
    nG = len(nodes_G)
    nQ = len(nodes_Q)

    # Initialize minimum cost as infinity (start very high)
    min_cost = float('inf')
    best_ops = []  # to store best list of edit operations

    # Try all possible mappings of G's nodes to Q's nodes
    for mapping in permutations(nodes_Q, min(nG, nQ)):
        mapping = dict(zip(nodes_G, mapping))  # pair G nodes with Q nodes
        ops = []  # track operations for this mapping

        # Node substitutions (renaming)
        subst_cost = 0
        for u in mapping:
            if u != mapping[u]:
                ops.append(f"Substitute node {u} → {mapping[u]}")
                subst_cost += 1

        # Map G’s edges according to node mapping
        mapped_edges_G = set()
        for (u, v) in edges_G:
            if u in mapping and v in mapping:
                mapped_edges_G.add(tuple(sorted((mapping[u], mapping[v]))))

        # Edges that exist in G but not in Q → deletions
        edge_del = edges_G - set([(u, v) for (u, v) in edges_G if u in mapping and v in mapping])
        edge_del_cost = len(edge_del)
        for e in edge_del:
            ops.append(f"Delete edge {e}")

        # Edges that exist in Q but not in mapped G → insertions
        edge_ins = edges_Q - mapped_edges_G
        edge_ins_cost = len(edge_ins)
        for e in edge_ins:
            ops.append(f"Insert edge {e}")

        # Nodes that exist in G but not in Q → deletions
        node_del = set(nodes_G) - set(mapping.keys())
        node_del_cost = len(node_del)
        for n in node_del:
            ops.append(f"Delete node {n}")

        # Nodes that exist in Q but not in G → insertions
        node_ins = set(nodes_Q) - set(mapping.values())
        node_ins_cost = len(node_ins)
        for n in node_ins:
            ops.append(f"Insert node {n}")

        # Compute total edit cost
        total_cost = subst_cost + edge_del_cost + edge_ins_cost + node_del_cost + node_ins_cost

        # Keep best (minimum cost) result
        if total_cost < min_cost:
            min_cost = total_cost
            best_ops = ops

    return min_cost, best_ops


G = {'nodes': ['A','B','C'], 'edges': [('A','B'),('B','C')]} ## Graph goes here the big graph can not be handle 
Q = {'nodes': ['A','B'], 'edges': [('A','B')]}

cost, ops = graph_edit_distance_with_ops(G, Q)
print("Graph Edit Distance:", cost)
for op in ops:
    print("-", op)
