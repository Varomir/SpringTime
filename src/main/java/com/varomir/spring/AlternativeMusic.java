package com.varomir.spring;

import org.springframework.stereotype.Component;

@Component("alternative")
public class AlternativeMusic implements Music {
    
    @Override
    public String getSong() {
        return "Korn - Did My Time";
    }
}
