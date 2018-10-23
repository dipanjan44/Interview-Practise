package HackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class AlternatingCharacters {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

        scanner.close();
    }

    /** implemented by Dipanjan **/
    public static int alternatingCharacters(String s)
    {
        Stack<Character> stk= new Stack<Character>();
        int count=0;
        stk.push(s.charAt(0));
        for(int i=1;i < s.length();i++)
        {
            if(s.charAt(i) == stk.peek())
            {
                count=count+1;
            }
                 else
            {
                stk.push(s.charAt(i));
            }
        }

        return count;
    }

}