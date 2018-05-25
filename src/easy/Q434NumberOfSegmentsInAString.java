package easy;

/**
 * 2018.5.25 Question 434. Number of Segments in a String
 * https://leetcode.com/problems/number-of-segments-in-a-string/description/
 *
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence
 * of non-space characters.
 * Please note that the string does not contain any non-printable characters.
 */
public class Q434NumberOfSegmentsInAString {
    public static int countSegments(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        return s.split("\\s+").length;
    }
}
