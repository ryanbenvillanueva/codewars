public class MultiplicationTableForNumber {

    public static String multiTable(int num) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                sb.append(i + " * " + num + " = " + (i * num));
            } else {
                sb.append(i + " * " + num + " = " + (i * num) + "\n");
            }
        }

        return sb.toString();
    }
}