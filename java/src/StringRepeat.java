public class StringRepeat {
    private static String repeatStr(final int repeat, final String string) {
        StringBuilder repeated = new StringBuilder();
        int count = repeat;

        while (count > 0) {
            repeated.append(string);
            count--;
        }

        return repeated.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(7, "repeat"));

    }
}
