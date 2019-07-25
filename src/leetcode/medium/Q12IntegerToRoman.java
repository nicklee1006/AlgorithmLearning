package leetcode.medium;

public class Q12IntegerToRoman {
    public static String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();

        // count to represent 1, 10, 100...
        int count = 0;

        while (num != 0) {
            int temp = num % 10;

            String tempStr = getRoman(temp, count);
            stringBuilder.insert(0, tempStr);

            count++;

            num = num / 10;
        }

        return stringBuilder.toString();
    }

    private static String getRoman(int num, int count) {
        char[] ten = {'I', 'X', 'C', 'M'};
        char[] five = {'V', 'L', 'D'};

        StringBuilder stringBuilder = new StringBuilder();

        if (num <= 3) {
            while (num != 0) {
                stringBuilder.append(ten[count]);
                num--;
            }
        } else if (num == 4) {
            stringBuilder.append(ten[count]).append(five[count]);
        } else if (num == 5) {
            stringBuilder.append(five[count]);
        } else if (num < 9) {
            stringBuilder.append(five[count]);

            while ((num - 5) != 0) {
                stringBuilder.append(ten[count]);
                num--;
            }
        } else if (num == 9) {
            stringBuilder.append(ten[count]).append(ten[count + 1]);
        }

        return stringBuilder.toString();
    }
}
