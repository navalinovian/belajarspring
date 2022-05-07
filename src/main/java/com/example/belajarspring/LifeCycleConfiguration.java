package com.example.belajarspring;

import com.example.belajarspring.data.Connection;
import com.example.belajarspring.data.Server;
import org.springframework.context.annotation.Bean;

public class LifeCycleConfiguration {

    @Bean
    public Connection connection(){
        return new Connection();
    }

//    @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    public Server Server(){
        return new Server();
    }
}
