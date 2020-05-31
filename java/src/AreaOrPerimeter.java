public class AreaOrPerimeter {
    public static int areaOrPerimeter(int a, int b) {
        return a == b ? a * b : 2 * (a + b);
    }

    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(4, 4));
    }
}
P
