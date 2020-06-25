import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbers.length; i++) {
            int difference = target - numbers[i];

            if (map.containsKey(difference)) {
                result[0] = i;
                result[1] = map.get(difference);
            }

            map.put(numbers[i], i);
        }

        return result;
    }
}
