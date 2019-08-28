package medium;

import java.util.ArrayList;
import java.util.List;

public class Q71SimplifyPath {
    public static String simplifyPath(String path) {
        // split the path by '/'
        String[] split = path.split("/");

        List<String> wordList = new ArrayList<>();
        for (String s : split) {
            if (s.equals("") || s.equals(".")) {
                continue;
            }

            wordList.add(s);
        }

        List<String> resultList = new ArrayList<>();
        for (String s : wordList) {
            if (s.equals("..")) {
                if (!resultList.isEmpty()) {
                    resultList.remove(resultList.size() - 1);
                }
            } else {
                resultList.add(s);
            }
        }

        String result = String.join("/", resultList);
        return "/" + result;
    }
}
