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
                if(opt.type == Type.LOGICAL && a.type == Type.BOOL && b.type == Type.BOOL){
                    tokens.push(new Token(input_string));
                }else if(opt.type == Type.LOGICAL && a.type == Type.BOOL && b.type == Type.BOOL){

                }else{
                    System.out.println("Type Missed Match");
                }

            }
        }

    }
    Boolean reduce(){
        return rule5() || rule6();
    }
  

    Boolean rule5() {

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
