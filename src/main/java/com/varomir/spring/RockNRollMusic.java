package com.varomir.spring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RockNRollMusic implements Music {
    
    @Override
    public List<String> getSong() {
        return Arrays.asList("Elvis Presley - Can't Help Falling In Love", "Chuck Berry - You Never Can Tell", "Little Richard - Long Tall Sally");
    }
}
