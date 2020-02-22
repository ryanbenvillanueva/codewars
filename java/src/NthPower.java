public class NthPower {
    public static int nthPower(int[] array, int n) {
        return (n < array.length) ? (int) Math.pow(array[n], n) : -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(nthPower(array, 2));
    }
}
