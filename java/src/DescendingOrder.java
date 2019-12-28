import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        int length = String.valueOf(num).length();
        int[] digits = new int[length];
        int number = num;

        for (int i = 0; i < length; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        Arrays.sort(digits);

        for (int i = 0; i < digits.length / 2; i++) {
            int temp = digits[i];
            digits[i] = digits[digits.length - 1 - i];
            digits[digits.length - 1 - i] = temp;
        }

        StringBuilder s = new StringBuilder();

        for (int i : digits) {
            s.append(i);
        }

        return Integer.parseInt(s.toString());
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(123456789));
    }
}
