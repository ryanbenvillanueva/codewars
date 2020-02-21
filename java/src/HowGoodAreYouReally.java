public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int count = classPoints.length;
        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += classPoints[i];
        }

        int average = sum / count;

        return yourPoints > average;
    }

    public static void main(String[] args) {
        int[] classPoints = {100, 40, 34, 57, 29, 72, 57, 88};
        System.out.println(betterThanAverage(classPoints, 75));
    }
}
