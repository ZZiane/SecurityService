package org.zzach.dev;

import org.zzach.dev.business.JwtService;
import org.zzach.dev.dao.UserRepository;
import org.zzach.dev.entites.Role;
import org.zzach.dev.entites.User;
import org.zzach.dev.enums.TokenType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SecurityServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner test(UserRepository userRepository, PasswordEncoder encoder) {
        return (args) -> {
            User u = User.builder().email("root").password(encoder.encode("root")).enabled(true).role(Role.ADMIN).build();
            userRepository.save(u);
        };
    }
}
