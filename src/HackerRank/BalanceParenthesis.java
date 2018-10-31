package HackerRank;

import java.util.Scanner;
import java.util.Stack;

public class BalanceParenthesis {

//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println(balanceParenthesis(sc.next()));
//
//    }

    public boolean balanceParenthesis(String inputString) {

        Stack<Character> stk = new Stack<Character>();

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '(' || inputString.charAt(i) == '{' || inputString.charAt(i) == '[') {
                stk.push(inputString.charAt(i));
            } else if ((inputString.charAt(i) == ')' || inputString.charAt(i) == '}' || inputString.charAt(i) == ']') && !stk.isEmpty()) {
                if ((inputString.charAt(i) == ')' && stk.peek() == '(') || (inputString.charAt(i) == ']' && stk.peek() == '[') || (inputString.charAt(i) == '}' && stk.peek() == '{')) {
                    stk.pop();
                } else {
                    return false;
                }
            } else if (inputString.charAt(i) == ')' || inputString.charAt(i) == '}' || inputString.charAt(i) == ']') {
                return false;
            }

        }

        if (stk.isEmpty()) {
            return true;
        }

        return false;

    }
}
