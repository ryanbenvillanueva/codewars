public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sumOfArr1 = 0;
        int sumOfArr2 = 0;

        for (int number : arr1) {
            sumOfArr1 += number;
        }

        for (int number : arr2) {
            sumOfArr2 += number;
        }

        return sumOfArr1 + sumOfArr2;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        System.out.println(arrayPlusArray(arr1, arr2));
    }
}
