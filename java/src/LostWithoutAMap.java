import java.util.*;
import java.util.stream.Collectors;

public class LostWithoutAMap {
    public static int[] map(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : arr) {
            list.add(i);
        }

        list = list.stream().map(num -> num * 2).collect(Collectors.toList());
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}