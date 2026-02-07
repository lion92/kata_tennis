import Player.Player;
import Tennis.Tennis;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TennisTest {
    @Test
    void should_return_loveAll_when_score_player1_player2_are_0() {
        // Given
        Tennis tennis = new Tennis();

        // When

        tennis.getPlayer1().setScore(0);
        tennis.getPlayer2().setScore(0);
        String score = tennis.getScore();

        // Then
        Assertions.assertEquals("Love-All", score);
    }

    @Test
    void should_return_love_fifteen_when_score_player1_player2_are_0_15() {
        // Given
        Tennis tennis = new Tennis();

        // When

        tennis.getPlayer1().setScore(0);
        tennis.getPlayer2().setScore(15);
        String score = tennis.getScore();

        // Then
        Assertions.assertEquals("Love-Fifteen", score);
    }

    @Test
    void should_return_fifteen_love_when_score_player1_player2_are_15_0() {
        // Given
        Tennis tennis = new Tennis();

        // When

        tennis.getPlayer1().setScore(15);
        tennis.getPlayer2().setScore(0);
        String score = tennis.getScore();

        // Then
        Assertions.assertEquals("Fifteen-Love", score);
    }



}
