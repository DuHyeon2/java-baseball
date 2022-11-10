package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class GameStart {
    public void gameStart(){
        CheckBall checkBall = new CheckBall();
        RightBall rightBall = new RightBall();
        List<Integer> my_ball = new ArrayList<>();

        System.out.println("숫자 야구 게임을 시작합니다");
        System.out.print("숫자를 입력해주세요 : ");
        String ball = Console.readLine();
        for(int i = 0; i < ball.length(); i++){
            my_ball.add(i);
        }
        rightBall.rightBall(checkBall.checkBall(my_ball,checkBall.computerBall()));
        restart();
    }

    public void restart(){
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요. ");
        String restart = Console.readLine();
        if(restart.equals("1")) {
            gameStart();
        }
    }
}

