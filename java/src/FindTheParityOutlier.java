public class FindTheParityOutlier {
    static int find(int[] integers) {
        int oddCount = 0;
        int evenCount = 0;
        int outlier = integers[0];
        
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (evenCount > oddCount) {
            for (int i : integers) {
                if (i % 2 != 0) {
                    outlier = i;
                    break;
                }
            }
        } else {
            for (int i : integers) {
                if (i % 2 == 0) {
                    outlier = i;
                    break;
                }
            }
        }

        return outlier;
    }
}