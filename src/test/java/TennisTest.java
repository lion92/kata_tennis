import Player.Player;
import Tennis.Tennis;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TennisTest {

    // ========== TESTS ÉGALITÉ (X-All) ==========

    @Test
    void should_return_loveAll_when_score_player1_player2_are_0_0() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(0);
        tennis.getPlayer2().setScore(0);
        Assertions.assertEquals("Love-All", tennis.getScore());
    }

    @Test
    void should_return_Fifteen_All_when_score_player1_player2_are_15_15() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(15);
        tennis.getPlayer2().setScore(15);
        Assertions.assertEquals("Fifteen-All", tennis.getScore());
    }

    @Test
    void should_return_Thirty_All_when_score_player1_player2_are_30_30() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(30);
        tennis.getPlayer2().setScore(30);
        Assertions.assertEquals("Thirty-All", tennis.getScore());
    }

    @Test
    void should_return_Deuce_when_score_player1_player2_are_40_40() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(40);
        tennis.getPlayer2().setScore(40);
        Assertions.assertEquals("Deuce", tennis.getScore());
    }

    // ========== TESTS PLAYER 1 MÈNE (Love-X) ==========

    @Test
    void should_return_Love_Fifteen_when_score_player1_player2_are_0_15() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(0);
        tennis.getPlayer2().setScore(15);
        Assertions.assertEquals("Love-Fifteen", tennis.getScore());
    }

    @Test
    void should_return_Love_Thirty_when_score_player1_player2_are_0_30() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(0);
        tennis.getPlayer2().setScore(30);
        Assertions.assertEquals("Love-Thirty", tennis.getScore());
    }

    @Test
    void should_return_Love_Forty_when_score_player1_player2_are_0_40() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(0);
        tennis.getPlayer2().setScore(40);
        Assertions.assertEquals("Love-Forty", tennis.getScore());
    }

    // ========== TESTS PLAYER 2 MÈNE (Fifteen-X) ==========

    @Test
    void should_return_Fifteen_Love_when_score_player1_player2_are_15_0() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(15);
        tennis.getPlayer2().setScore(0);
        Assertions.assertEquals("Fifteen-Love", tennis.getScore());
    }

    @Test
    void should_return_Fifteen_Thirty_when_score_player1_player2_are_15_30() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(15);
        tennis.getPlayer2().setScore(30);
        Assertions.assertEquals("Fifteen-Thirty", tennis.getScore());
    }

    @Test
    void should_return_Fifteen_Forty_when_score_player1_player2_are_15_40() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(15);
        tennis.getPlayer2().setScore(40);
        Assertions.assertEquals("Fifteen-Forty", tennis.getScore());
    }

    // ========== TESTS THIRTY-X ==========

    @Test
    void should_return_Thirty_Love_when_score_player1_player2_are_30_0() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(30);
        tennis.getPlayer2().setScore(0);
        Assertions.assertEquals("Thirty-Love", tennis.getScore());
    }

    @Test
    void should_return_Thirty_Fifteen_when_score_player1_player2_are_30_15() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(30);
        tennis.getPlayer2().setScore(15);
        Assertions.assertEquals("Thirty-Fifteen", tennis.getScore());
    }

    @Test
    void should_return_Thirty_Forty_when_score_player1_player2_are_30_40() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(30);
        tennis.getPlayer2().setScore(40);
        Assertions.assertEquals("Thirty-Forty", tennis.getScore());
    }

    // ========== TESTS FORTY-X ==========

    @Test
    void should_return_Forty_Love_when_score_player1_player2_are_40_0() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(40);
        tennis.getPlayer2().setScore(0);
        Assertions.assertEquals("Forty-Love", tennis.getScore());
    }

    @Test
    void should_return_Forty_Fifteen_when_score_player1_player2_are_40_15() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(40);
        tennis.getPlayer2().setScore(15);
        Assertions.assertEquals("Forty-Fifteen", tennis.getScore());
    }

    @Test
    void should_return_Forty_Thirty_when_score_player1_player2_are_40_30() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(40);
        tennis.getPlayer2().setScore(30);
        Assertions.assertEquals("Forty-Thirty", tennis.getScore());
    }

    // ========== TESTS AVANTAGE ET VICTOIRE ==========

    @Test
    void should_return_Advantage_Player1_when_score_player1_player2_are_41_40() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(40);
        tennis.getPlayer2().setScore(40);
        tennis.getPlayer1().setScore(tennis.getPlayer1().getScore() + 1);

        Assertions.assertEquals("Advantage player1", tennis.getScore());
    }

    @Test
    void should_return_Advantage_Player2_when_score_player1_player2_are_40_41() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(40);
        tennis.getPlayer2().setScore(41);
        Assertions.assertEquals("Advantage player2", tennis.getScore());
    }

    @Test
    void should_return_Win_For_Player1_when_score_player1_player2_are_42_40() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(42);
        tennis.getPlayer2().setScore(40);
        Assertions.assertEquals("Win for player1", tennis.getScore());
    }

    @Test
    void should_return_Win_For_Player2_when_score_player1_player2_are_40_42() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(40);
        tennis.getPlayer2().setScore(42);
        Assertions.assertEquals("Win for player2", tennis.getScore());
    }

    @Test
    void should_return_Win_For_Player1_when_score_player1_player2_are_50_48() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(50);
        tennis.getPlayer2().setScore(48);
        Assertions.assertEquals("Win for player1", tennis.getScore());
    }

    @Test
    void should_return_Win_For_Player2_when_score_player1_player2_are_48_50() {
        Tennis tennis = new Tennis();
        tennis.getPlayer1().setScore(48);
        tennis.getPlayer2().setScore(50);
        Assertions.assertEquals("Win for player2", tennis.getScore());
    }
}