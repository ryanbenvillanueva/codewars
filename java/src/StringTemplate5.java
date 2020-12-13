public class StringTemplate5 {
    public static String buildString(String... args) {
        return "I like " + String.join(", ", args) + "!";
    }
}
