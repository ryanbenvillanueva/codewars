public class FuelCalculator {
    public static double fuelPrice(int litres, double pricePerLitre) {
        double totalCost = 0;

        if (litres >= 2 && litres < 4) {
            totalCost = (litres * pricePerLitre) - (litres * 0.05);
        } else if (litres >= 4 && litres < 6) {
            totalCost = (litres * pricePerLitre) - (litres * 0.10);
        } else if (litres >= 6 && litres < 8) {
            totalCost = (litres * pricePerLitre) - (litres * 0.15);
        } else if (litres >= 8 && litres < 10) {
            totalCost = (litres * pricePerLitre) - (litres * 0.20);
        } else {
            totalCost = (litres * pricePerLitre) - (litres * 0.25);
        }

        return totalCost;
    }
}