public class Alarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        return (employed && !vacation);
    }

    public static void main(String[] args) {
        boolean employed = true;
        boolean vacation = false;
        System.out.println(setAlarm(employed, vacation));
    }
}
