package easy;

/**
 * 2018.6.11 Question 551. Student Attendance Record I
 * https://leetcode.com/problems/student-attendance-record-i/description/
 *
 * You are given a string representing an attendance record for a student. The record only contains the
 * following three characters:
 * 'A' : Absent.
 * 'L' : Late.
 * 'P' : Present.
 * A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than
 * two continuous 'L' (late).
 *
 * You need to return whether the student could be rewarded according to his attendance record.
 */
public class Q551StudentAttendanceRecordI {
    public static boolean checkRecord(String s) {
        int numberOfA = 0;

        int countL = 0;

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);

            if (temp == 'A') {
                numberOfA++;
                countL = 0;

                if (numberOfA > 1) {
                    return false;
                }
            } else if (temp == 'P') {
                countL = 0;
            } else if (temp == 'L') {
                countL++;

                if (countL > 2) {
                    return false;
                }
            }
        }

        return true;
    }
}
