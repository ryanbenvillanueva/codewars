public class HolidayDutyFree {

    public static int dutyFree(int normPrice, int discount, int hol) {
        return (int) (hol / ((discount / 100.0f) * normPrice));
    }

}