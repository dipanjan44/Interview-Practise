package HackerRank;

import java.io.*;
import java.util.*;


public class Anagram {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        Map<Character,Integer> c1= new HashMap<Character,Integer>();
        Map<Character,Integer> c2= new HashMap<Character,Integer>();

        int count=0;
        int diffeOccur=0;


        for(int i=0;i< a.length();i++)
        {
            if (c1.containsKey(a.charAt(i)))
            {
                c1.put(a.charAt(i), c1.get(a.charAt(i))+1);
            }

            else
            {
                c1.put(a.charAt(i),1);
            }
        }

        for(int i=0;i< b.length();i++)
        {
            if (c2.containsKey(b.charAt(i)))
            {
                c2.put(b.charAt(i), c2.get(b.charAt(i))+1);
            }

            else
            {
                c2.put(b.charAt(i),1);
            }
        }


        for(Map.Entry<Character,Integer> m: c1.entrySet())
        {
            if(c2.containsKey(m.getKey()))
            {

                int diff= Math.abs(c1.get(m.getKey()) -c2.get(m.getKey()));
                diffeOccur=diffeOccur+diff;
            }

            else
                count++;
        }

        return (count+diffeOccur);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        //String a = scanner.nextLine();
//        //String b = scanner.nextLine();
        String b ="aba";
        String a ="afghiaabbbb";

        int res = makeAnagram(a, b);
        System.out.println(res);

//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
