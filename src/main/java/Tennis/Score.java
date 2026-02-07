package Tennis;

public enum Score {
    LOVE_ALL(0, 0, "Love-All"),
    FIFTEEN_LOVE(15, 0, "Fifteen-Love"),
    LOVE_FIFTEEN(0, 15, "Love-Fifteen");

    private final int player1Score;
    private final int player2Score;
    private final String display;


    Score(int player1Score, int player2Score, String display) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.display = display;
    }

    public String getDisplayName() {
        return display;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    // Potentiellement d'autres getters si nécessaire
}