public class ParseNiceInt {
    public static int howOld(final String herOld) {
        String[] age = herOld.split("");

        return Integer.parseInt(age[0]);

    }
}
