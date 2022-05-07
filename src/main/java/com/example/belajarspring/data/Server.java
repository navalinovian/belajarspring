package com.example.belajarspring.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class Server {

    @PostConstruct
    public void start(){
      log.info("Start Server");
    }

    @PreDestroy
    public void stop(){
        log.info("Stop Server");
    }
}
