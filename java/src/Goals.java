public class Goals {
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
    }

    public static void main(String[] args) {
        System.out.println(goals(1, 3, 5));
    }
}
