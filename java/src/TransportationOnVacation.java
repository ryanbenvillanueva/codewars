public class TransportationOnVacation {
    public static int rentalCarCost(int d) {
        if (d == 1) {
            return 40;
        } else if (d == 2) {
            return 80;
        } else if (d < 7) {
            return (40 * d - 20);
        } else {
            return (40 * d - 50);
        }
    }
}