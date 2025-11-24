package practical_13;

import java.util.Stack;
import practical_13.Token;

enum Type {
    NUM, BOOL, COMPARISON, LOGICAL
}

public class Interpreter {
    public Stack<Token> tokens = new Stack<>();

    Interpreter(String input_string) {
        String[] parts = input_string.trim().split("\\s+");
        for (String part : parts) {
            tokens.push(new Token(part));
            if (tokens.size() == 3) {
                Token opt = tokens.pop();
                Token a = tokens.pop();
                Token b = tokens.pop();

                switch (opt.type) {
                    case LOGICAL:

                        break;
                    case COMPARISON:
                        System.out.println("hello");
                        break;
                }
            }
        }

    }
    void reduce(){
        return rule5() | rule6();
    }
    String rule6() {
        return "hello ";
    }

    Boolean rule5() {

        return false;
    }

    public static void main(String[] args) {
        Interpreter i = new Interpreter("8.3 5 > false and");
        for (Token t : i.tokens) {
            System.out.println(t);
        }
    }
}
