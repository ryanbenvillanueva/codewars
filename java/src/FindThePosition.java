public class FindThePosition {
    public static String position(char alphabet) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        return "Position of alphabet: " + (str.indexOf(alphabet) + 1);
    }
}
