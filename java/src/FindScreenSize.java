class FindScreenSize {
    public static String findScreenHeight(int width, String ratio) {
        String[] parts = ratio.split(":");

        int height = width * Integer.valueOf(parts[1]) / Integer.valueOf(parts[0]);

        return width + "x" + height;
    }
}