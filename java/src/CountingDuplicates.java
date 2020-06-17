import java.util.*;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String string = text.toLowerCase();
        char[] arr = string.toCharArray();
        Set<Character> duplicates = new HashSet<Character>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr[i]) {
                duplicates.add(arr[i]);
            }
        }

        return duplicates.size();
    }
}