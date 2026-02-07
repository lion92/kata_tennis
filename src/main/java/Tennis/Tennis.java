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
            return Score.LOVE_ALL.getDisplayName();
        }
        if(player1.getScore() == 0 && player2.getScore() == 15) {
            return Score.LOVE_FIFTEEN.getDisplayName();
        }

         if(player1.getScore() == 15 && player2.getScore() == 0) {
             return Score.FIFTEEN_LOVE.getDisplayName();
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
