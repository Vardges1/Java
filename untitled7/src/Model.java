public class Model {
    private Team Milan;
    private Team Madrid;

    private Team LastScorer;

    public Model(){
        Milan = new Team("Milan");
        Madrid = new Team("Madrid");
    }

    public void onMadridWin(){
        Madrid.IncreaseScore();
        LastScorer = Madrid;
    }

    public void onMilanWin(){
        Milan.IncreaseScore();
        LastScorer = Milan;
    }

    public String GetScore() {
        return "Result:  " + Milan.GetScore() + " X " + Madrid.GetScore() + "          " + GetLastScorer();
    }

    public String GetWinner(){
        int milanScore = Milan.GetScore();
        int madridScore = Madrid.GetScore();

        if (milanScore > madridScore) {
            return " Winner: " + Milan.GetName();
        } else if (milanScore < madridScore) {
            return " Winner: " + Madrid.GetName();
        } else {
            return " Winner: DRAW";
        }
    }

    public String GetLastScorer(){
        return " Last Scorer: " + LastScorer.GetName();
    }
}
