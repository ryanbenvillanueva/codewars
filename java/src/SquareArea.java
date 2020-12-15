public class SquareArea {
    public static double squareArea(double A) {
        double l = (2 * A) / Math.PI;
        double x = l * l;
        double y = Math.round(x * 100) * 0.01d;
        return y;
    }
}