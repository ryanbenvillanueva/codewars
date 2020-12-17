public class WellOfIdeasEasyVersion {

    public static String well(String[] x) {
        int goodIdeas = 0;

        for (String s : x) {
            if (s.equals("good")) {
                goodIdeas++;
            }
        }

        if (goodIdeas == 1 || goodIdeas == 2) {
            return "Publish!";
        } else if (goodIdeas > 2) {
            return "I smell a series!";
        } else {
            return "Fail!";
        }
    }

}