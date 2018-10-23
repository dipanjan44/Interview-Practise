package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DivisiblePairSum {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] a = new int[n];

        int count=0;

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        for ( int i=0;i<n;i++)
        {
            for (int j=i+1; j<n-1;j++)
            {
                if((a[i]+a[j]) % k == 0)
                    count = count+1;
                System.out.println(count);
            }
        }
        System.out.println(count);

        scanner.close();
    }
}
