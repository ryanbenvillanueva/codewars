import java.util.Arrays;

public class SumWithoutMinAndMax {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0 || numbers.length == 1) {
            return 0;
        }

        Arrays.sort(numbers);
        int sum = 0;

        for (int i = 1; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(sum(numbers));
    }

}
