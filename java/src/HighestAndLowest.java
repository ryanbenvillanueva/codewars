public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        String[] strArray = numbers.split(" ");
        int[] intArray = new int[strArray.length];
        int lowest = Integer.parseInt(strArray[0]);
        int highest = Integer.parseInt(strArray[0]);

        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);

            if (intArray[i] < lowest) {
                lowest = intArray[i];
            }

            if (intArray[i] > highest) {
                highest = intArray[i];
            }
        }

        return highest + " " + lowest;
    }

    public static void main(String[] args) {
        HighestAndLowest hal = new HighestAndLowest();

        System.out.println(highAndLow("1 2 3 4 5 6 7 8 9"));
    }

}
