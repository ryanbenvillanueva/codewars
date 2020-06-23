public class CountPositivesSumNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        int[] countAndSum = new int[2];
        int[] empty = {};

        if (input == null) {
            return empty;
        }

        if (input.length == 0) {
            return empty;
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                countAndSum[1] += input[i];
            }

            if (input[i] > 0) {
                countAndSum[0] += 1;
            }
        }

        return countAndSum;
    }
}