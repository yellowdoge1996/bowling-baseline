package bowling;

/**
 * @author yellowdoge1996
 */
public class Bowling {
    int score;
    int[] rolls = new int[21];
    int rollsIndex = 0;

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

        int[] game = new int[10];
        int index = 0;

        for (int i = 0; i < game.length; i++){
            if (this.rolls[index] + this.rolls[index + 1] > 10){
                this.score += 10 + this.rolls[index + 1] + this.rolls[index + 2];
            }else if (this.rolls[index] + this.rolls[index + 1] == 10){
                this.score += 10 + this.rolls[index + 1];
            }else {
                this.score += this.rolls[index] + this.rolls[index + 1];
            }
            index = index + (((this.rolls[index] + this.rolls[index + 1]) > 10) ? 1 : 2);
        }

//        for (int i = 0; i < this.rollsIndex; i++) {
//            if (round > 10) {
//                break;
//            }
//            this.score += this.rolls[i];
//            if (bollNumber == 1) {
//                if (this.rolls[i] == 10) {
//                    //Strike
//                    this.score = this.score + this.rolls[i + 1] + this.rolls[i + 2];
//                } else {
//                    bollNumber++;
//                    break;
//                }
//            } else {
//                if (this.rolls[i] + this.rolls[i - 1] == 10) {
//                    //spare
//                    this.score = this.score + this.rolls[i + 1];
//                }
////                else {
//                    //other
////                    this.score = this.score + this.rolls[i] + this.rolls[i - 1];
////                }
//                bollNumber = 1;
//            }
//            round++;
//        }
        return this.score;
    }
}
