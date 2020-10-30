package bowling;

/**
 * @author yellowdoge1996
 */
public class Bowling {
    int score;
    int[] rolls = new int[21];
    int rollsIndex = 0;
    private static final int ALL_DOWN = 10;

    public void roll(int n) {
        this.rolls[rollsIndex] = n;
        this.rollsIndex++;
    }

    /**
     * 计算总分
     *
     * @return 得分
     */
    public int getScore() {
        if (this.score != 0) {
            this.score = 0;
        }

        int round = 1;
        int bollNumber = 1;
//        int[] game = new int[10];
//        int index = 0;

//        for (int i = 0; i < game.length; i++){
//            if (this.rolls[index] == ALL_DOWN){
//                game[i] = ALL_DOWN + this.rolls[i + 1] + this.rolls[i + 2];
//            }
//        }
        for (int i = 0; i < this.rollsIndex; i++) {
            if (round > 10) {
                break;
            }
            this.score += this.rolls[i];
            if (bollNumber == 1) {
                if (this.rolls[i] == 10) {
                    //Strike
                    this.score = this.score + this.rolls[i + 1] + this.rolls[i + 2];
                    round++;
                } else {
                    bollNumber++;
                }
            } else {
                if (this.rolls[i] + this.rolls[i - 1] == 10) {
                    //spare
                    this.score = this.score + this.rolls[i + 1];
                }
//                else {
                    //other
//                    this.score = this.score + this.rolls[i] + this.rolls[i - 1];
//                }
                round++;
                bollNumber = 1;
            }
        }
        return this.score;
    }
}
