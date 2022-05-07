package com.example.belajarspring;

import com.example.belajarspring.configuration.BarConfiguration;
import com.example.belajarspring.configuration.FooConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
