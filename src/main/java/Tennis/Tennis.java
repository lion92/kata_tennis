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
        if(Score.LOVE_ALL.getPlayer1Score() == player1.getScore() && Score.LOVE_ALL.getPlayer2Score() == player2.getScore()) {
            return Score.LOVE_ALL.getDisplayName();
        }
        if(Score.LOVE_FIFTEEN.getPlayer1Score() == player1.getScore() && Score.LOVE_FIFTEEN.getPlayer2Score() == player2.getScore()) {
            return Score.LOVE_FIFTEEN.getDisplayName();
        }

         if(Score.FIFTEEN_LOVE.getPlayer1Score() == player1.getScore() && Score.FIFTEEN_LOVE.getPlayer2Score() == player2.getScore()) {
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
