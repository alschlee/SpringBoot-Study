package me.leejinkyung;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService,
                          UserServiceSetterInjection userServiceSetterInjection) {
        return args -> {
            System.out.println(userService.provideService());
            System.out.println(userServiceSetterInjection.provideService());
        };
    }
}