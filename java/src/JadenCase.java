public class JadenCase {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty())
            return null;

        String[] words = phrase.split(" ");

        for (int i = 0; i < words.length; i++) {
            String firstLetter = words[i].substring(0, 1);
            words[i] = firstLetter.toUpperCase() + words[i].substring(1);
        }

        return String.join(" ", words);
    }

}