public class StringyStrings {
    public static String stringy(int size) {
        StringBuilder s = new StringBuilder();

        int index = 0;
        while (index < size) {
            if (index % 2 == 0) {
                s.append("1");
            } else {
                s.append("0");
            }

            index++;
        }

        return s.toString();
    }
}
