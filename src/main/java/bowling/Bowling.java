package bowling;

/**
 * @author yellowdoge1996
 */
public class Bowling {
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

        int score = 0;

        for (int i = 0, index = 0, length = 10; i < length; i++,index++){
            if (this.rolls[index] + this.rolls[index + 1] > 10){
                score += 10 + this.rolls[index + 1] + this.rolls[index + 1];
            }else if (this.rolls[index] + this.rolls[index + 1] == 10){
                score += 10 + this.rolls[++index  + 1];
            }else {
                score += this.rolls[index] + this.rolls[ ++index  ];
            }
        }
        return score;
    }
}
