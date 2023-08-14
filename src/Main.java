import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BaseballPlayer young = new BaseballPlayer("Young");
        FootballPlayer tavan = new FootballPlayer("Tavan");
        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo");

        Team liverpool = new Team("Liverpool");
        liverpool.addPlayer(young);
        liverpool.addPlayer(tavan);
        liverpool.addPlayer(ronaldo);

        System.out.println(liverpool.numOfPlayers());

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> items) {
        for (int i : items) {

        }
    }

}