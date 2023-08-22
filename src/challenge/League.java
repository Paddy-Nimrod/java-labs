package challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends LeagueTeam> {
    private String name;
    private List<LeagueTeam> teams = new ArrayList<>();


    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " already in the league.");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " added to the league.");
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public List<LeagueTeam> getTeams() {
        return teams;
    }

    public void sortAllTeams(){
        Collections.sort(teams);
    }

}
