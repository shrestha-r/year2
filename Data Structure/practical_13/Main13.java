package practical_13;

import java.util.*;
import practical_13.Token;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String: ");
        String input = sc.nextLine();
        String[] parts = input.trim().split("\\s+");
        List<Token> ts = new ArrayList<>();
        for(String part: parts){
            ts.add(new Token(part));
        }

        for(Token t: ts){
         System.out.println(t);   
        }



        // String s = "<";
        // // System.out.println("This is Double.");
        // // try{

        // // }
        // if (s.equalsIgnoreCase("true") | s.equalsIgnoreCase("false")) {
        //     System.out.println("This is boolean");
        // } else if (s.equalsIgnoreCase("or") | s.equalsIgnoreCase("and")) {
        //     System.out.println("This is Logical");
        // }else if(s.equalsIgnoreCase(">") | s.equalsIgnoreCase("<")){
        //     System.out.println("This is Comparision.");
        // }else{
        //     System.out.println("Not Allowed");
        // }

    }
}
