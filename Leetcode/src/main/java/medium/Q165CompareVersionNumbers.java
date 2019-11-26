package medium;

public class Q165CompareVersionNumbers {
    public static int compareVersion(String version1, String version2) {
        // split the string by '.'
        String[] version1Split = version1.split("\\.");
        String[] version2Split = version2.split("\\.");

        int i = 0;
        int j = 0;

        while (i < version1Split.length || j < version2Split.length) {
            // ignore leading '0'
            int number1 = i < version1Split.length ? Integer.parseInt(version1Split[i]) : 0;
            int number2 = j < version2Split.length ? Integer.parseInt(version2Split[j]) : 0;

            int result = Integer.compare(number1, number2);

            if (result == 0) {
                i++;
                j++;
            } else {
                return result;
            }
        }

        return 0;
    }
}
