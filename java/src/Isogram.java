public class Isogram {
    public static boolean isIsogram(String str) {
        String lowered = str.toLowerCase();
        int[] letters = new int[26];

        for (int i = 0; i < lowered.length(); i++) {
            letters[lowered.charAt(i) - 'a']++;

            if (letters[lowered.charAt(i) - 'a'] > 1) {
                return false;
            }
        }

        return true;
    }
}
