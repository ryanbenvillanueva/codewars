import java.util.List;
import java.util.ArrayList;

public class Kata13December {

    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        List<Integer> newList = new ArrayList<Integer>();

        for (int i : listOfNumbers) {
            if (i % 2 != 0) {
                newList.add(i);
            }
        }

        return newList;
    }

}