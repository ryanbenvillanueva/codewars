public class Cube {
    private int side = 0;

    public int getSide() {
        return this.side;
    }

    public void setSide(int num) {
        this.side = num;
    }

    public static void main(String[] args) {
        Cube c = new Cube();
        c.setSide(7);
        System.out.println(c.getSide());
    }
}
