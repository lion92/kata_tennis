package Player;

public class Player {
    String name;
    int score;

     public Player(String name) {
        this.name = name;
        this.score = -1;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int setScore(int score) {
        this.score = score;
        return score;
    }
}
