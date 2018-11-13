package HackerRank;

import java.util.Stack;

public class ReverseWords {

    public static void main(String[] args) {

        System.out.println(reverseWords("The sky is blue"));


    }

    public static String reverseWords(String s) {

        Stack<String> stk = new Stack<String>();
        StringBuilder sb = new StringBuilder();
        String[] splitString = s.split(" ");

        for( int i=0;i < splitString.length;i++)
        {
            stk.push(splitString[i]);
        }

        while(!stk.isEmpty()) {
            sb.append(stk.pop());
            sb.append(" ");
        }

        return sb.toString();


    }
}
