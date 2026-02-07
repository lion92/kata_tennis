package Tennis;

public enum Score {
    LOVE(0, "Love"),
    FIFTEEN(15, "Fifteen"),
    THIRTY(30, "Thirty"),
    FORTY(40, "Forty"),
    DEUCE(40, "Deuce" );

    private final int points;
    private final String display;

    Score(int points, String display) {
        this.points = points;
        this.display = display;
    }

    public String getDisplayName() {
        return display;
    }

    public int getPoints() {
        return points;
    }
}