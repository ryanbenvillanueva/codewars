public class StairsInTwenty {
    public static long stairsIn20(int[][] stairs) {
        long sum = 0;

        for (int i = 0; i < stairs.length; i++) {
            for (int j = 0; j < stairs[i].length; j++) {
                sum += stairs[i][j];
            }
        }

        return sum * 20;
    }
}
