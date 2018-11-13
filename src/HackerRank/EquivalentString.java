package HackerRank;

import java.util.Stack;

public class EquivalentString {


    public static void main(String[] args) {

        System.out.println(isEquivalent("aaaabb"));

    }


    public static String isEquivalent(String str1)
    {

        Stack<String> stk= new Stack<String>();

        int i=0;
        int count=1;

        System.out.println(str1.charAt(0));


        // aaaabb  //a4b3cda3

        while(i < str1.length())
        {
            while(str1.charAt(i)==str1.charAt(i+1) && ((i+1) <= str1.length()))
            {
                count=count+1;
                i=i+1;
            }

            if (count >1)
            {
                stk.push(String.valueOf(count));
                stk.push(String.valueOf(str1.charAt(i)));
                count=1;
            }

            else
            {
                    stk.push(String.valueOf(str1.charAt(i)));
                    i++;

            }


        }
        StringBuilder sb= new StringBuilder();
        while(!stk.isEmpty())

        {
            sb.append(stk.pop());
        }


        return sb.toString();



    }

}
