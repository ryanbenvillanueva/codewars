public class BooleanToString {
    public static String convert(boolean b) {
        if (b) {
            return "true";
        } else {
            return "false";
        }
    }

    public static void main(String[] args) {
        System.out.println(convert(false));
    }
}