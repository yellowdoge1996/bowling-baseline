package bowling;

/**
 * @author yellowdoge1996
 */
public class Bowling {
    int[] rolls = new int[21];
    int rollsIndex = 0;
    public static final int ROUND = 10;

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

        for (int i = 0; i < ROUND; i++) {
            if (rolls[rollsIndex] + rolls[rollsIndex + 1] > 10) {
                score += 10 + rolls[rollsIndex = rollsIndex + 1] + rolls[rollsIndex + 1];
            } else if (rolls[rollsIndex] + rolls[rollsIndex + 1] == 10) {
                score += 10 + rolls[rollsIndex = rollsIndex + 2];
            } else {
                score += rolls[rollsIndex++] + rolls[rollsIndex++];
            }
        }
        return score;
    }
}
