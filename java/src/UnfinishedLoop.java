import java.util.ArrayList;
import java.util.List;

public class UnfinishedLoop {

    public static List<Integer> CreateList(int number) {
        List<Integer> list = new ArrayList<>();

        for (int count = 1; count <= number; count++) {
            list.add(count);
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(CreateList(10));
    }
}
