package com.example.belajarspring;

import com.example.belajarspring.data.Connection;
import org.springframework.context.annotation.Bean;

public class LifeCycleConfiguration {

    @Bean
    public Connection connection(){
        return new Connection();
    }
}
