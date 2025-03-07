import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player p1= new Player("Mihai Ionut", 0, 1);
        Player p2= new Player("George Bonsai", 0, 2);
        SetScorer scoreTable1 = new SetScorer(p1, p2);

        scoreTable1.scoreCalculator();

        int[] p1_test_scores = {1,2,3,3};
        int[] p2_test_scores = {2,1,3,4};

        for(int i = 0; i <= 3; i++){
            p1.setScore(p1_test_scores[i]);
            p2.setScore(p2_test_scores[i]);

            scoreTable1.setGamesPlayed(p1_test_scores[i]+p2_test_scores[i]);

            scoreTable1.scoreCalculator();
        }

    }
}
