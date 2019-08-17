package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q49GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();

            // sort
            Arrays.sort(charArray);

            String key = new String(charArray);

            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> tempList = new ArrayList<>();
                tempList.add(str);

                map.put(key, tempList);
            }
        }

        return new ArrayList<>(map.values());
    }
}
