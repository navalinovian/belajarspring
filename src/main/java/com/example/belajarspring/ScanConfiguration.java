package com.example.belajarspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "com.example.belajarspring.configuration"
})
public class ScanConfiguration {
}
