package com.varomir.spring;

import org.springframework.stereotype.Component;

@Component
public class RockNRollMusic implements Music {
    
    @Override
    public String getSong() {
        return "Elvis Presley - Can't Help Falling In Love";
    }
}
