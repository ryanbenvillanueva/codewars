public class LeonardoDiCaprio {
    public static String leo(final int oscar) {
        String message = "";

        if (oscar == 88) {
            message = "Leo finally won the oscar! Leo is happy";
        } else if (oscar == 86) {
            message = "Not even for Wolf of wallstreet?!";
        } else if (oscar < 88) {
            message = "When will you give Leo an Oscar?";
        } else if (oscar > 88) {
            message = "Leo got one already!";
        }

        return message;
    }
}