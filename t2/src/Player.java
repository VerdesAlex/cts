public class Player {
    private String name;
    private int score;
    private int id;

    public Player(String name, int score, int id) {
        this.name = name;
        this.score = score;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    private void updateScore() {
        score++;
    }

    public Player getWinningPlayer(Player p) {
        return this.getScore() > p.getScore() ? this : p;
    }
}
