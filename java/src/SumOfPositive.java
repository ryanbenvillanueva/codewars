import java.util.Scanner;

public class SumOfPositive {

    public static int sum(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                total += arr[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner reader = new Scanner(System.in);
        int n = 0;

        while (n < arr.length) {
            System.out.print("Enter the numbers of the array: ");
            arr[n] = Integer.parseInt(reader.nextLine());
            n++;
        }

        System.out.println("The sum of positive numbers is " + SumOfPositive.sum(arr));
    }
}
