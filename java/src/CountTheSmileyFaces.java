import java.util.Arrays;
import java.util.List;

public class CountTheSmileyFaces {
    public static int countSmileys(List<String> arr) {
        int smileyCount = 0;
        String validSmileys = ":) :-) :D :-D :~) :~D ;) ;-) ;D ;-D ;~) ;~D";

        for (String smiley : arr) {
            if (validSmileys.contains(smiley)) {
                smileyCount++;
            }
        }

        return smileyCount;
    }

    public static void main(String[] args) {
        List<String> arr = Arrays.asList(";D", ":-(", ":-)", ";~)");
        System.out.println(countSmileys(arr));
    }
}
