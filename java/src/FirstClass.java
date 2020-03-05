public class FirstClass {
    public static byte sum(byte a, byte b) {
        return (byte) (a + b);
    }

    public static void main(String[] args) {
        byte a = 1;
        byte b = 2;
        System.out.println(sum(a, b));
    }
}
