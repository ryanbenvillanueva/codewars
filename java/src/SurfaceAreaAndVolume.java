public class SurfaceAreaAndVolume {
    public static int[] getSize(int w, int h, int d) {
        int area = (2 * w * h) + (2 * w * d) + (2 * h * d);
        int volume = w * h * d;

        return new int[] {area, volume};
    }
}
