package challenge;

public class LeagueTeam<T> {
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
}
