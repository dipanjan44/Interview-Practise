package HackerRank;

import javax.xml.stream.events.Characters;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        String status="";
        Map<Character,Integer> m1= new HashMap<Character,Integer>();
        Map<Character,Integer> m2= new HashMap<Character,Integer>();

        for (int i=0;i< s1.length();i++)
        {
            if(m1.containsKey(s1.charAt(i)))
            {
                m1.put(s1.charAt(i),s1.charAt(i)+1);
            }
            else
            {
                m1.put(s1.charAt(i),1);
            }
        }


        for (int i=0;i< s2.length();i++)
        {
            if(m2.containsKey(s2.charAt(i)))
            {
                m2.put(s2.charAt(i),s2.charAt(i)+1);
            }
            else
            {
                m2.put(s2.charAt(i),1);
            }
        }

        for (Map.Entry<Character,Integer> m: m1.entrySet())
        {
            if(m2.containsKey(m.getKey()))
            {
                status="Yes";
                break;
            }
            else
            status="NO";
        }
        return status;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

