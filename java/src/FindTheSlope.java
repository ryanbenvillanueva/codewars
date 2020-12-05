public class FindTheSlope {

    public String slope(int[] points) {
        String slope = "";

        if (points[2] - points[0] == 0) {
            slope = "undefined";
        } else {
            slope = ((points[3] - points[1]) / (points[2] - points[0])) + "";
        }
        
        return slope;
    }

}
