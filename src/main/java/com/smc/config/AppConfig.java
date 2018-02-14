package com.smc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.smc.springdemo.HelloWorld;

import java.util.UUID;

@Configuration
@ComponentScan("com.smc")
@PropertySource("classpath:simple-properties-file.properties")
public class AppConfig {

    @Value("${salutation}") private String salutation;
    @Value("${server.name}") private String serverName;


    @Bean
    public HelloWorld helloWorldBean() {
        return new HelloWorld(UUID.randomUUID().toString(), salutation, serverName);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
        Resource[] resources = new ClassPathResource[ ] {
                new ClassPathResource("simple-properties-file.properties"),
                new ClassPathResource("arrays-in-properties-file.properties")
        };
        pspc.setLocations(resources);
        pspc.setIgnoreUnresolvablePlaceholders(true);
        return pspc;
    }

}
