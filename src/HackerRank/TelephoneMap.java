package HackerRank;//Complete this code or write your own from scratch
import java.util.*;


class TelephoneMap{

    private static Map<String,Integer> telePhoneMap= new HashMap<String,Integer>();
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            telePhoneMap.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (telePhoneMap.containsKey(s))
            {
                System.out.println(s+"="+telePhoneMap.get(s));
            }
           else
            {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
