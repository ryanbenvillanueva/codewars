public class DivisibleNb {
    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }

    public static void main(String[] args) {
        System.out.println(isDivisible(24, 3, 4));
    }
}
