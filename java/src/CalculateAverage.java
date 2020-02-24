public class CalculateAverage {
    public static double find_average(int[] array) {
        int count = array.length;
        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += array[i];
        }

        return (double) sum / count;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};
        System.out.println(find_average(array));
    }
}
