package com.udemydemo.udemy.Config;

import com.udemydemo.udemy.Game.BomberMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {

    @Bean()
    public BomberMan bomberMan(){
        return new BomberMan();
    }

}
