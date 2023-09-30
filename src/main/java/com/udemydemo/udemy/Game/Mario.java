package com.udemydemo.udemy.Game;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Lazy
public class Mario implements Game{
    public Mario(){
        System.out.println(Mario.gameName + "의 생성자가 호출되었습니다.");
    }
    @Override
    public void run() {
        System.out.println(Mario.gameName + " 게임을 실행합니다.");
    }

    @Override
    public String getGameData() {
        return "Game Name :" + Mario.gameName;
    }

    private static String gameName = "Mario";
}
