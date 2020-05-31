public class YouOnlyNeedOne {

    public static boolean check(Object[] a, Object x) {
        boolean isElement = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                isElement = true;
                break;

            }
        }

        return isElement;
    }
}