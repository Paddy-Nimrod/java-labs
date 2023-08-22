import challenge.League;
import challenge.LeagueTeam;
import challenge.teams.BasketBallTeam;
import challenge.teams.FootBallTeam;

public class Main {
    public static void main(String[] args) {

        League epl = new League("English Premier League");

        LeagueTeam<FootBallTeam> liverpool = new LeagueTeam<>("Liverpool");
        LeagueTeam<FootBallTeam> chelsea = new LeagueTeam<>("Chelsea");
        LeagueTeam<FootBallTeam> afc = new LeagueTeam<>("AFC Leopards");
        LeagueTeam<FootBallTeam> gor = new LeagueTeam<>("Gor Mahia");

        LeagueTeam<BasketBallTeam> lakers = new LeagueTeam<>("Lakers");

        epl.addTeam(liverpool);
        epl.addTeam(chelsea);
        epl.addTeam(afc);
        epl.addTeam(gor);

        epl.addTeam(lakers);
        System.out.println(epl.getTeams());


        epl.sortAllTeams();


//        BaseballPlayer young = new BaseballPlayer("Young");
//        FootballPlayer tavan = new FootballPlayer("Tavan");
//        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo");
//
//        Team<FootballPlayer> liverpool = new Team<>("Liverpool");
////        liverpool.addPlayer(young);
//        liverpool.addPlayer(tavan);
////        liverpool.addPlayer(ronaldo);
//
//        System.out.println(liverpool.numOfPlayers());
//
//        Team<BaseballPlayer> bafana = new Team<>("Bafana");
//
//        bafana.addPlayer(young);
//
//
//        Team<SoccerPlayer> team = new Team<>("arrow");
//        team.addPlayer(ronaldo);
//
//        Team<FootballPlayer> harambee = new Team<>("Harambee");
//        FootballPlayer oliech = new FootballPlayer("Denis Oliech");
//        harambee.addPlayer(oliech);
//
//        Team<FootballPlayer> afc = new Team<>("AFC Leopards");
//        Team<FootballPlayer> tusker = new Team<>("Tusker");
//
//        afc.matchResult(tusker, 3, 1);
////        afc.matchResult(bafana,2,1);
//
////        tusker.matchResult(bafana,2,2);
//        tusker.matchResult(afc, 1, 0);
//
//
//        System.out.println("Rankings");
//        System.out.println(afc.getName() + " : " + afc.ranking());
//        System.out.println(tusker.getName() + " : " + tusker.ranking());
//
//
//        System.out.println(afc.compareTo(tusker));

    }
}