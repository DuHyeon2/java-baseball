package baseball;

import java.util.ArrayList;
import java.util.List;

public class RightBall {
    public int rightBall(List<Integer> check){
        if(check.get(0) == 3){
            System.out.println("3스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return 0;
        }
        if(check.get(0) == 0 && check.get(1) == 0){
            System.out.println("낫싱");
            return 0;
        }
        else {
            if(check.get(1) > 0) {
                System.out.print(check.get(1) + "볼 ");
            }

            if(check.get(0) > 0) {
                System.out.println(check.get(0) + "스트라이크");
            }
            return 0;
        }
    }
}
