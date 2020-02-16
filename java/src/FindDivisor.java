public class FindDivisor {
    public long numberOfDivisors(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        FindDivisor findDivisor = new FindDivisor();
        System.out.println(findDivisor.numberOfDivisors(24));
    }
}
