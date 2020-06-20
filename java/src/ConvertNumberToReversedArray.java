public class ConvertNumberToReversedArray {

    public static int[] digitize(long n) {
        String[] digits = Long.toString(n).split("");
        int len = digits.length;
        int[] arr = new int[len];
        
        for (int i = len - 1; i >= 0; i--) {
            arr[len - 1 - i] = Integer.parseInt(digits[i]);
        }

        return arr;
    }
}