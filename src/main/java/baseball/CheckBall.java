package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class CheckBall {

    public List<Integer> computerBall(){
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    public List<Integer> checkBall(List<Integer> myBall, List<Integer> computer) {
        int strike = 0, ball = 0;
        List<Integer> check = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (myBall.get(i) == computer.get(i)) {
                strike++;
            } else if (myBall.contains(computer.get(i))) {
                ball++;
            }
        }
        check.add(strike);
        check.add(ball);
        return check;
    }

}
