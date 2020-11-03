public class Ghost {

    private String color;

    public Ghost() {
        int max = 4;
        int min = 1;
        int range = max - min + 1;

        int rand = (int) (Math.random() * range) + min;

        if (rand == 1) {
            this.color = "white";
        } else if (rand == 2) {
            this.color = "yellow";
        } else if (rand == 3) {
            this.color = "purple";
        } else {
            this.color = "red";
        }
    }

    public String getColor() {
        return this.color;
    }
}