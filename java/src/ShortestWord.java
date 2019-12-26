public class ShortestWord {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int shortest = words[0].length();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < shortest) {
                shortest = words[i].length();
            }
        }

        return shortest;
    }

    public static void main(String[] args) {
        System.out.println(findShort("Given string of words return the length of the shortest word"));
    }
}
