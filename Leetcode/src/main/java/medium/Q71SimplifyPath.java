package medium;

import java.util.ArrayList;
import java.util.List;

public class Q71SimplifyPath {
    public static String simplifyPath(String path) {
        // split the path by '/'
        String[] split = path.split("/");

        // filter out all empty or "." string
        List<String> wordList = new ArrayList<>();
        for (String s : split) {
            if (s.equals("") || s.equals(".")) {
                continue;
            }

            wordList.add(s);
        }

        // wordList is all remaining
        // resultList is our result list
        List<String> resultList = new ArrayList<>();
        for (String s : wordList) {
            // if meet "..", remove last element in resultList
            if (s.equals("..")) {
                if (!resultList.isEmpty()) {
                    resultList.remove(resultList.size() - 1);
                }
            } else {
                resultList.add(s);
            }
        }

        // construct final result
        String result = String.join("/", resultList);
        return "/" + result;
    }
}
