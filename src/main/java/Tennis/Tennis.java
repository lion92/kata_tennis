package Tennis;

import Player.Player;

public class Tennis {
    private final Player player1;
    private final Player player2;

    public Tennis() {
        this.player1 = new Player("player1");
        this.player2 = new Player("player2");
    }

    public String getScore() {
        // Gestion des cas >= 40 points (Deuce, Advantage, Win)
        if (player1.getScore() >= Score.FORTY.getPoints() &&
                player2.getScore() >= Score.FORTY.getPoints()) {
            return handleDeuceAndAdvantage();
        }

        // Gestion des égalités (Love-All, Fifteen-All, Thirty-All)
        if (player1.getScore() == player2.getScore()) {
            return getScoreEnum(player1.getScore()).getDisplayName() + "-All";
        }

        // Cas général : construction dynamique du score
        return getScoreEnum(player1.getScore()).getDisplayName() +
                "-" +
                getScoreEnum(player2.getScore()).getDisplayName();
    }

    private String handleDeuceAndAdvantage() {
        int diff = player1.getScore() - player2.getScore();

        if (diff == 0) {
            return "Deuce";
        } else if (diff == 1) {
            return "Advantage " + player1.getName();
        } else if (diff == -1) {
            return "Advantage " + player2.getName();
        } else if (diff >= 2) {
            return "Win for " + player1.getName();
        } else {
            return "Win for " + player2.getName();
        }
    }

    private Score getScoreEnum(int points) {
        for (Score score : Score.values()) {
            if (score.getPoints() == points) {
                return score;
            }
        }
        throw new IllegalStateException("Invalid score: " + points);
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }
}