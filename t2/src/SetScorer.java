import static java.util.Collections.max;

public class SetScorer{
    private int gamesPlayed = 0;
    private Player player1, player2;
    private final Player tiedMatch = new Player("Tie", gamesPlayed/2, 0);

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public SetScorer(int gamesPlayed, Player player1, Player player2) {
        this.gamesPlayed = gamesPlayed;
        this.player1 = player1;
        this.player2 = player2;
    }

    public SetScorer(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void scoreCalculator() {
        valid();
        if(gamesPlayed == 6){
            Player winner = getWinner();
            showWinner(winner);
        }
        else{
            showScore();
        }
    }

    public void valid() {
        if(player2.getScore() + player1.getScore() > gamesPlayed || gamesPlayed > 6 || player2.getScore() + player1.getScore() > 6) {
            throw  new RuntimeException("The number of games is bigger than the allowed number!");
        }
    }

    public Player getWinner(){
        if(player1.getScore() == player2.getScore()){
            return tiedMatch;
        }
        else if(player1.getScore() > player2.getScore()){
            return player1;
        }
        else{
            return player2;
        }
    }

    public void showWinner(Player p){
        if(p.getId() != 0){
            System.out.println("Player " + p.getName() + " wins with " + p.getScore() + " wins!");
        }
        else{
            System.out.println("Playes " + player1.getName() + " and " + player2.getName() + " are tied!");
        }
    }
    public void showScore(){
        if(player1.getScore() == player2.getScore()){
            System.out.println("Players are tied, " + player2.getScore() + " to " +  player1.getScore() + "!");
        }
        else{
            System.out.println("Player " + player1.getWinningPlayer(player2).getName() + " leads with " + player1.getWinningPlayer(player2).getScore() + " wins!" );
        }
    }
}