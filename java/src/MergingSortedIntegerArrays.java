import java.util.Arrays;

public class MergingSortedIntegerArrays {
    public static int[] mergeArrays(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        int index = 0;

        for (int val : first) {
            merged[index] = val;
            index++;
        }

        for (int val : second) {
            merged[index] = val;
            index++;
        }

        Arrays.sort(merged);

        return Arrays.stream(merged).distinct().toArray();
    }
}
