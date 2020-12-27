public class LarioAndMuigiPipeProblem  {
    public static int[] pipeFix(int[] numbers) {
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        int length = max - min + 1;
        int[] nums = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = min;
            min++;
        }

        return nums;
    }
}
