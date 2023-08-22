package challenge;

public class LeagueTeam<T> implements Comparable<LeagueTeam<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int draw = 0;

    public LeagueTeam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public int ranking() {
        return (won * 3) + draw;
    }

    @Override
    public int compareTo(LeagueTeam<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
