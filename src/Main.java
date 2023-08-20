import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BaseballPlayer young = new BaseballPlayer("Young");
        FootballPlayer tavan = new FootballPlayer("Tavan");
        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo");

        Team<FootballPlayer> liverpool = new Team<>("Liverpool");
//        liverpool.addPlayer(young);
        liverpool.addPlayer(tavan);
//        liverpool.addPlayer(ronaldo);

        System.out.println(liverpool.numOfPlayers());

        Team<BaseballPlayer> bafana = new Team<>("Bafana");

        bafana.addPlayer(young);


        Team<SoccerPlayer> team = new Team<>("arrow");
        team.addPlayer(ronaldo);

        Team<FootballPlayer> harambee = new Team<>("Harambee");
        FootballPlayer oliech = new FootballPlayer("Denis Oliech");
        harambee.addPlayer(oliech);

        Team<FootballPlayer> afc = new Team<>("AFC Leopards");
        Team<FootballPlayer> tusker = new Team<>("Tusker");

        afc.matchResult(tusker,3,1);
        afc.matchResult(bafana,2,1);

        tusker.matchResult(bafana,2,2);
        tusker.matchResult(afc,1,0);





        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> items) {
        for (int i : items) System.out.println("i = " + i);
    }

}