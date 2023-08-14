import java.util.ArrayList;

public class Team {
    int played = 0;
    int won = 0;
    int lost = 0;
    int draw = 0;
    int goalDifference = 0;
    private String name;
    private ArrayList<Player> members = new ArrayList<>();

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

    public boolean addPlayer(Player player) {
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

    public void matchResult(Team opponentTeam, int ourScore, int oppScores) {
        if (ourScore > oppScores) {
            won++;
            System.out.println("We have recorded a win on this game.");
        } else if (oppScores > ourScore) {
            draw++;
        } else {
            lost++;
        }
        played++;
        if (opponentTeam != null) {
            opponentTeam.matchResult(null, ourScore, oppScores);
        }
    }

    public int ranking() {
        return (won * 3) + draw;
    }

}
