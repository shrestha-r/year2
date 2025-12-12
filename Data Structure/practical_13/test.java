package practical_13;

import java.util.Stack;

import practical_13.*;

public class test {
    static Stack<Token> tokens = new Stack<>(); 
    

    public static void main(String[] args) {
        String input_string = "8.3 10 > false";
        String[] parts = input_string.trim().split("\\s+");
        for (String part : parts) {
            tokens.add(new Token(part));
            if (tokens.size() >= 3) {
                int n = tokens.size();
        Token token1 = tokens.get(n - 1);
        Token token2 = tokens.get(n - 2);
        Token token3 = tokens.get(n - 3);

        // WE have two operator Comparision and Logical

        // For Comparision 
        switch (token1.type) {
            case COMPARISON:
                if(token2.type == Type.NUM && token3.type == Type.NUM){
                    double left = (Double) token2.value;
                    double right = (Double) token3.value;
                    boolean result = token1.value.equals('>') ? left > right: left< right;
                    
                    tokens.removeAll(tokens);
                    tokens.push(new Token(Boolean.toString(result)));
                }else{
                    System.out.println("Invalid");
                }
                break;
            case LOGICAL:
                if(token2.type == Type.BOOL && token3.type == Type.BOOL){
                    Boolean left = (Boolean) token2.value;
                    Boolean right = (Boolean) token3.value;
                    boolean result = ((String)token1.value).equalsIgnoreCase("and")? Boolean.logicalAnd(left, right): Boolean.logicalOr(left, right);
                    tokens.removeAll(tokens);
                    tokens.push(new Token(Boolean.toString(result)));
                }else{
                    System.out.println("Invalid");
                }
        }

            }
        }
        System.out.println(tokens);
    }
}
