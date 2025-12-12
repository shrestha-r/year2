package practical_13;

import java.util.Stack;
import practical_13.Token;


public class Interpreter {
    public Stack<Token> tokens = new Stack<>();

    Interpreter(String input_string) {
        String[] parts = input_string.trim().split("\\s+");
        for (String part : parts) {
            tokens.push(new Token(part));
            if(tokens.size() > 3){
                rule5();
                rule6();
            }
        }

    }

    Boolean rule5() {
        int n = tokens.size();
        Token operator = tokens.get(n-1);;
        Token operand__a = tokens.get(n-2);;
        Token operand_b = tokens.get(n-3);;
        boolean result = false;
        if(operator.type == Type.COMPARISON && operand__a.type == Type.NUM && operand_b.type == Type.NUM){
            double left = (Double)operand__a.value;
            double right = (Double)operand_b.value;
            result = operator.value.equals('>')?left > right: left < right;
        }
        return false;

    }
      Boolean rule6() {
        return true;
    }

    public static void main(String[] args) {
        Interpreter i = new Interpreter("8.3 5 > false and");
        for (Token t : i.tokens) {
            System.out.println(t);
        }
    }
}
