package com.udemydemo.udemy.Game;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PacMan implements Game{
    public PacMan(){
        System.out.println(PacMan.gameName + "의 생성자가 호출되었습니다.");
    }
    @Override
    public void run() {
        System.out.println(PacMan.gameName + " 게임을 실행합니다.");
    }

    @Override
    public String getGameData() {
        return "Game Name :" + PacMan.gameName;
    }

    private static String gameName = "Pacman";
}
