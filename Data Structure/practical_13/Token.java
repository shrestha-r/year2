package practical_13;

enum Type {
    NUM, BOOL, COMPARISON, LOGICAL
}

public class Token {
    Type type;
    Object value;

    public Token(String string_part) {
        try {
            value = Double.parseDouble(string_part);
            // System.out.println("This is Double");
            type = Type.NUM;
            return;
        } catch (NumberFormatException ignore) {
        }
        if (string_part.equalsIgnoreCase("true") || string_part.equalsIgnoreCase("false")) {
            // System.out.println("This is boolean");
            type = Type.BOOL;
            value = Boolean.parseBoolean(string_part);
            return;
        } else if (string_part.equalsIgnoreCase("or") || string_part.equalsIgnoreCase("and")) {
            // System.out.println("This is Logical");
            type = Type.LOGICAL;
            value = string_part.toUpperCase();
            return;

        } else if (string_part.equalsIgnoreCase(">") || string_part.equalsIgnoreCase("<")) {
            // System.out.println("This is Comparision.");
            type = Type.COMPARISON;
            value = string_part;
            return;
        } else {
            throw new IllegalArgumentException("Unknown token: " + string_part);
        }
    }

    public Type getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    public String toString() {
        return type + "(" + value + ")";
    }
}

// Value stored as Object to allow Double, Boolean, or String.
// Casting is required when applying interpreter rules.
