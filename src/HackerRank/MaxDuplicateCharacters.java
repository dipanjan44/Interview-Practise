package HackerRank;

import java.util.*;

public class MaxDuplicateCharacters {

    public static void maxduplicateCharacters(String input) {
        Map<Character, Integer> hm = new HashMap<Character, Integer>();

        for (int i = 0; i < input.length(); i++) {
            if (hm.containsKey(input.charAt(i))) {
                hm.put(input.charAt(i), hm.get(input.charAt(i)) + 1);
            } else
                hm.put(input.charAt(i), 1);
        }
        System.out.println((sortMapbyValue(hm)));
    }

    private static Map.Entry<Character,Integer> sortMapbyValue(Map<Character, Integer> hm) {

        List<Map.Entry<Character, Integer>> mapEntry = new ArrayList<>(hm.entrySet());

        Collections.sort(mapEntry, new Comparator<Map.Entry<Character, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                        return o2.getValue() - o1.getValue();
                    }
                }
        );

        return mapEntry.get(0);

    }

    public static void main(String[] args) {

        String str="aaabbc";
        maxduplicateCharacters(str);

    }

}
