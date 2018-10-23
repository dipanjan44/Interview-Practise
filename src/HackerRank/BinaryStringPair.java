package HackerRank;

import java.util.*;

public class BinaryStringPair {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputString = sc.next();

        System.out.println("The pair count is : " +numberofPairs(inputString));
    }

    private static int numberofPairs(String inputString) {
        Stack<Character> stk = new Stack<Character>();
        int i = 0;
        int count = 0;

        while (i < inputString.length()) {
            stk.push(inputString.charAt(i));
            if (((i+1)< inputString.length()) && (inputString.charAt(i + 1) == stk.peek())) {
                stk.pop();
                count = count + 1;
            }
            i = i + 2;
        }
        return count;
    }
}
