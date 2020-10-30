package bowling;

/**
 * @author yellowdoge1996
 */
public class Bowling {
    int[] rolls = new int[21];
    int rollsIndex = 0;

    public void roll(int n) {
        rolls[rollsIndex] = n;
        rollsIndex++;
    }

    /**
     * 计算总分
     *
     * @return 得分
     */
    public int getScore() {

        int score = 0;
        rollsIndex = 0;

        for (int i = 0; i < 10; i++) {
            int count = rolls[rollsIndex] + rolls[rollsIndex + 1];
            if (count > 10) {
                score += count + rolls[rollsIndex++ + 2];
            } else if (count == 10) {
                score += count + rolls[rollsIndex = rollsIndex + 2];
            } else {
                score += count;
                rollsIndex += 2;
            }
        }
        return score;
    }
}
