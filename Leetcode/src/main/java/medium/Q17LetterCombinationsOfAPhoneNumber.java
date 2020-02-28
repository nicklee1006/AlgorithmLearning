package medium;

import java.util.*;

public class Q17LetterCombinationsOfAPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();

        if (digits.length() == 0) {
            return result;
        }

        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        result.add("");

        for (int i = 0; i < digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));

            // check the length of elements at the head of the list
            while (result.peek().length() == i) {
                String temp = result.remove();

                for (char c : mapping[x].toCharArray()) {
                    result.add(temp + c);
                }
            }
        }

        return result;
    }
//    public static List<String> letterCombinations(String digits) {
//        if (digits.length() == 0) {
//            return new ArrayList<>();
//        }
//
//        char[] digitsChar = digits.toCharArray();
//
//        Map<Integer, List<String>> keyMap = new HashMap<>();
//        keyMap.put(2, Arrays.asList("a", "b", "c"));
//        keyMap.put(3, Arrays.asList("d", "e", "f"));
//        keyMap.put(4, Arrays.asList("g", "h", "i"));
//        keyMap.put(5, Arrays.asList("j", "k", "l"));
//        keyMap.put(6, Arrays.asList("m", "n", "o"));
//        keyMap.put(7, Arrays.asList("p", "q", "r", "s"));
//        keyMap.put(8, Arrays.asList("t", "u", "v"));
//        keyMap.put(9, Arrays.asList("w", "x", "y", "z"));
//
//        List<String> result = new ArrayList<>(keyMap.get(Character.getNumericValue(digitsChar[0])));
//
//        for (int i = 1; i < digitsChar.length; i++) {
//            int digit = Character.getNumericValue(digitsChar[i]);
//
//            result = multipleStrings(result, keyMap.get(digit));
//        }
//
//        return result;
//    }
//
//    private static List<String> multipleStrings(List<String> a, List<String> b) {
//        List<String> result = new ArrayList<>();
//
//        for (String tempA : a) {
//            for (String tempB : b) {
//                result.add(tempA + tempB);
//            }
//        }
//
//        return result;
//    }
}
