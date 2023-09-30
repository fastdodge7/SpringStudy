package com.udemydemo.udemy.GameConsole;

import com.udemydemo.udemy.Game.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Nintendo implements GameConsole{

    @Autowired
    private Game game;


    @Override
    public void run() {
        System.out.println(Nintendo.consoleName + "게임기를 작동시킵니다.");
        System.out.println("실행 게임 정보\n" + game.getGameData());
        game.run();
    }

    @Override
    public void restart() {
        System.out.println(Nintendo.consoleName + "게임기를 재시작합니다.");
        System.out.println("실행 게임 정보\n" + game.getGameData());
        game.run();
    }

    private static String consoleName = "Nintendo";
}
