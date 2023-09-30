package com.udemydemo.udemy.GameConsole;

import com.udemydemo.udemy.Game.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PlayStation implements GameConsole{

    private Game game;

    @Autowired
    public PlayStation(Game game){
        this.game = game;
    }

    @Override
    public void run() {
        System.out.println(PlayStation.consoleName + "게임기를 작동시킵니다.");
        System.out.println("실행 게임 정보\n" + game.getGameData());
        game.run();
    }

    @Override
    public void restart() {
        System.out.println(PlayStation.consoleName + "게임기를 재시작합니다.");
        System.out.println("실행 게임 정보\n" + game.getGameData());
        game.run();
    }

    @Override
    public String toString(){
        return super.toString() + "\ngame hashcode : " + game.hashCode();
    }

    private static String consoleName = "Nintendo";
}
