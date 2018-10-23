package HackerRank;

public class CircularShift {


    public static void main(String args[])
    {
        String str="abcd";
        StringBuilder sb= new StringBuilder(str);
        int leftShiftCount=1;
        int rightShiftCount=2;

        System.out.println(circularshift(sb,leftShiftCount,rightShiftCount));
    }

    private static String circularshift(StringBuilder s, int leftShiftCount,int rightShiftCount) {


        StringBuilder s1=new StringBuilder(s.substring(leftShiftCount,s.length()) + s.substring(0,leftShiftCount));
        System.out.println(s1.toString());
        StringBuilder s2= new StringBuilder(s1.substring(s1.length()-rightShiftCount));
        StringBuilder s3= new StringBuilder(s1.substring(0,s1.length()-rightShiftCount));
       // s2.reverse();
        StringBuilder s4= new StringBuilder(s2.append(s3));


        return s4.toString();
    }

}
