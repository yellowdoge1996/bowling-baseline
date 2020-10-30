package bowling;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yellowdoge1996
 */
public class Bowling {
    List<Integer> rolls = new ArrayList<Integer>();

    public void roll(int n) {
        rolls.add(n);
    }

    /**
     * 计算总分
     *
     * @return 得分
     */
    public int getScore() {

        int score = 0;

        for (int i = 0, index = 0, length = 10; i < length; i++,index++){
            if (rolls.get(index) + rolls.get(index + 1) > 10){
                score += 10 + rolls.get(index + 1) + rolls.get(index + 1);
            }else if (rolls.get(index) + rolls.get(index + 1) == 10){
                score += 10 + rolls.get(++index  + 1);
            }else {
                score += rolls.get(index) + rolls.get( ++index  );
            }
        }
        return score;
    }
}
