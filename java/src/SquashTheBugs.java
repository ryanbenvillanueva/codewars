public class SquashTheBugs {
    public static int findLongest(final String str) {
        String[] spl = str.split(" ");
        int longest = spl[0].length();

        for (int i = 0; i < spl.length; i++) {
            if (spl[i].length() > longest) {
                longest = spl[i].length();
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(findLongest("The quick brown fox jumps over all the lazy dogs."));
    }
}
