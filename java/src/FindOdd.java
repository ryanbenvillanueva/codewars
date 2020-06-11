public class FindOdd {
    public static int findIt(int[] a) {

        int odd = 0;

        for (int i = 0; i < a.length; i++) {
            odd ^= a[i];
        }

        return odd;
    }
}