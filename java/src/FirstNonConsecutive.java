public class FirstNonConsecutive {
    static Integer find(final int[] array) {

        int first = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1] + 1) {
                first = array[i];
                break;
            }

        }

        if (first == array[0]) {
            return null;
        }

        return first;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8,};
        System.out.println(find(array));
    }
}
