import java.util.Arrays;

public class ConsecutiveNumbers {
    public static int consecutive(final int[] arr) {
        Arrays.sort(arr);
        int result = 0;

        for (int i = 1; i < arr.length; i++) {
            result += (arr[i] - arr[i - 1]) - 1;
        }

        return result;
    }
}
