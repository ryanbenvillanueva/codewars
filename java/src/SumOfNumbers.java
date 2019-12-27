public class SumOfNumbers {

    public static int GetSum(int a, int b) {
        int sum = 0;

        if (b < a) {
            int t = a;
            a = b;
            b = t;
        }

        for (int i = a; i <= b; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println(GetSum(a, b));
    }
}
