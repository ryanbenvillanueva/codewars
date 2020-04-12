public class CountLetterMatch {
    public static int strCount(String str, char letter) {
        int count = 0;
        int index = 0;

        if (str.length() == 0) {
            return 0;
        }

        while (index < str.length()) {
            if (str.charAt(index) == letter) {
                count++;
            }
            index++;
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(strCount("La Casa De Papel", 'a'));
    }
}
