public class SpinWords {

    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 4) {
                words[i] = reverse(words[i]);
            }
        }

        String result = String.join(" ", words);

        return result;
    }

    public static String reverse(String word) {
        char[] letters = word.toCharArray();
        int begin = 0;
        int end = letters.length - 1;

        while (end > begin) {
            char temp = letters[begin];
            letters[begin] = letters[end];
            letters[end] = temp;
            end--;
            begin++;
        }

        return new String(letters);
    }
}