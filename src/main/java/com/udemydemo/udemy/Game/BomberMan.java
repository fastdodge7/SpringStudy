package com.udemydemo.udemy.Game;

public class BomberMan implements Game{

    public BomberMan(){
        System.out.println(BomberMan.gameName + "의 생성자가 호출되었습니다.");
    }
    @Override
    public void run() {
        System.out.println(BomberMan.gameName + " 게임을 실행합니다.");
    }

    @Override
    public String getGameData() {
        return "Game Name :" + BomberMan.gameName;
    }

    private static String gameName = "BomberMan";
}
