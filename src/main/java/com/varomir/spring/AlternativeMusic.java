package com.varomir.spring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class AlternativeMusic implements Music {
    
    @Override
    public List<String> getSong() {
        return Arrays.asList("Korn - Did My Time", "System Of A Down - Chop Suey!", "Limp Bizkit - Nookie");
    }
}
