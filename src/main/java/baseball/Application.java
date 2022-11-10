package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Scanner sc = new Scanner(System.in);

        CheckBall checkBall = new CheckBall();
        RightBall rightBall = new RightBall();

        String ball;
        List<Integer> my_ball = new ArrayList<>();
        System.out.println("숫자 야구 게임을 시작합니다");
        System.out.print("숫자를 입력해주세요 : ");
        ball = sc.next();
        for(int i = 0; i < ball.length(); i++){
            my_ball.add(i);
        }
        rightBall.rightBall(checkBall.checkBall(my_ball,checkBall.computerBall()));
    }

}
