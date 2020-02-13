public class MultiplesOf3Or5 {
    public int solution(int number) {
        int sum = 0;

        if (number <= 3) {
            return 0;
        } else {
            for (int i = 3; i < number; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        MultiplesOf3Or5 multiple = new MultiplesOf3Or5();

        System.out.println(multiple.solution(10));
    }

}
