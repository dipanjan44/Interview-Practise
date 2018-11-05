package HackerRank;
import java.util.*;

public class SubstringCheck {

    public static List<String> getAllSubstring(String str)
    {
        List<String> substrList= new ArrayList<String>();
        for(int i=0;i<str.length();i++)
        {
            for (int j=i+1;j<=str.length();j++)
            {
                String temp=str.substring(i,j);
                substrList.add(temp);
            }
        }

        return substrList;
    }

    public static boolean isPresent(String actual, String test)
    {
        List<String> result= getAllSubstring("geeksforgeeks");

        if (result.contains(test))
        {
            int index=actual.indexOf(test);
            System.out.println(index);
            return true;
        }

        return false;
    }

    public static void main(String[] args) {


        Boolean result= isPresent("geeksforgeeks","for");

        System.out.println(result);

    }
}
