public class SquareNSum {
    public static int squareSum(int[] n) {
        int sum = 0;

        for (int i = 0; i < n.length; i++) {
            sum += n[i] * n[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        System.out.println(SquareNSum.squareSum(n));
    }
}
