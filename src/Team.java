import java.util.ArrayList;

public class Team<T extends Player> {
    private final String name;
    private final ArrayList<T> members = new ArrayList<>();
    int played = 0;
    int won = 0;
    int lost = 0;
    int draw = 0;
    int goalDifference = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGoalDifference(int ourScore, int oppScores) {
        goalDifference = ourScore - oppScores;
        return goalDifference;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already in the team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " is added to the team " + this.name);
            return true;
        }
    }

    public int numOfPlayers() {
        return members.size();
    }

    public void matchResult(Team<T> opponentTeam, int ourScore, int oppScores) {
        String message;
        if (ourScore > oppScores) {
            won++;
            message = " won ";
        } else if (oppScores > ourScore) {
            draw++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponentTeam != null) {
            opponentTeam.matchResult(null, ourScore, oppScores);
            System.out.println(this.getName() + " vs " + opponentTeam.getName());
            System.out.println(this.getName() + message + opponentTeam.getName());
        }
    }

    public int ranking() {
        return (won * 3) + draw;
    }

}
