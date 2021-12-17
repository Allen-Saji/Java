
import java.util.Scanner;
class Game{
    String p1, p2;
    Game(String p1, String p2){
        this.p1 = p1;
        this.p2 = p2;
    }


    void game(String p1, String p2){
        if(p1.equals("rock") && p2.equals("rock") ){
            System.out.println("It's a tie!");
        }
        else if(p1.equals("scissors")  && p2.equals("scissors")){
            System.out.println("It's a tie!");
        }
        else if(p1.equals("paper")  && p2.equals("paper")){
            System.out.println("It's a tie!");
        }
        else if(p1.equals("paper")  && p2.equals("rock") ){
            System.out.println("Player 1 Wins!");
        }
        else if(p1.equals("scissors")  && p2.equals("paper") ){
            System.out.println("Player 1 Wins!");
        }
        else if(p1.equals("rock")  && p2.equals("scissors")){
            System.out.println("Player 1 Wins!");
        }
        else if(p1.equals("rock")  && p2.equals("paper")){
            System.out.println("Player 2 Wins!");
        }
        else if(p1.equals("scissors") && p2.equals("rock")){
            System.out.println("Player 2 Wins!");
        }
        else if(p1.equals("paper")  && p2.equals("scissors")){
            System.out.println("Player 2 Wins!");
        }
        else{
            System.out.println("Invalid Input");
        }
    }

}

public class rps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Player1's input(rock/paper/scissors): ");
        String pl1 = sc.next();
        System.out.println("Player2's input(rock/paper/scissors): ");
        String pl2 = sc.next();


        Game G = new Game(pl1.toLowerCase(),pl2.toLowerCase());

        G.game(pl1.toLowerCase(),pl2.toLowerCase());

        sc.close();

    }
}
