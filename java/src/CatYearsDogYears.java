public class CatYearsDogYears {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int[] yearsArray = new int[3];

        if (humanYears == 1) {
            yearsArray[0] = 1;
            yearsArray[1] = 15;
            yearsArray[2] = 15;
        } else if (humanYears == 2) {
            yearsArray[0] = 2;
            yearsArray[1] = 24;
            yearsArray[2] = 24;
        } else {
            yearsArray[0] = humanYears;
            yearsArray[1] = 24 + (4 * (humanYears - 2));
            yearsArray[2] = 24 + (5 * (humanYears - 2));
        }

        return yearsArray;
    }

}
