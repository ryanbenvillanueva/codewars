public class OffspringSex {
    public static String chromosomeCheck(String sperm) {
        String result = "Congratulations! You're going to have a ";
        return sperm.contains("Y") ? result + "son." : result + "daughter.";
    }
}
