public class TotalPoints {

    public static int points(String[] games) {
        //implement me
        int totalPoints = 0;

        for (String game : games) {
            int x = Integer.valueOf(game.charAt(0));
            int y = Integer.valueOf(game.charAt(2));

            if (x > y) {
                totalPoints += 3;
            } else if (x < y) {

            } else if (x == y) {
                totalPoints += 1;
            }
        }

        return totalPoints;
    }

    public static void main(String[] args) {
        String[] games = {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"};

        System.out.println(points(games));
    }
}
