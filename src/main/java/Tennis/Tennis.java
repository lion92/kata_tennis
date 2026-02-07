package Tennis;

import Player.Player;

public class Tennis {
    private final Player player1;
    private final Player player2;

    private String score="";

    public Tennis() {
        this.player1 = new Player("Player 1");
        this.player2 = new Player("Player 2");
    }


     public String getScore() {
        if(player1.getScore() == 0 && player2.getScore() == 0) {
            score = "Love-All";
            return score;
        }
        if(player1.getScore() == 0 && player2.getScore() == 15) {
            score = "Love-Fifteen";
            return score;
        }

         if(player1.getScore() == 15 && player2.getScore() == 0) {
             score = "Fifteen-Love";
             return score;
         }

         return score;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }
}
