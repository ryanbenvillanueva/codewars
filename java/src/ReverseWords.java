public class ReverseWords {
    public static String reverseWords(final String original) {
        String[] words = original.split(" ");

        if (words.length == 0) {
            return original;
        }

        for (int i = 0; i < words.length; i++) {
            String reverse = "";

            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverse += words[i].charAt(j);
            }

            words[i] = reverse;
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("double  spaced  words!"));
    }
}
