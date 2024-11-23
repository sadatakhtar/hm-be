package com.homemade.hm.config;


import com.homemade.hm.model.Role;
import com.homemade.hm.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseInitializer {

    @Bean
    public CommandLineRunner initDatabase(RoleRepository roleRepository) {
        return args -> {
            if (roleRepository.findByName("BUYER").isEmpty()) {
                roleRepository.save(new Role(null, "BUYER"));
            }
            if (roleRepository.findByName("SELLER").isEmpty()) {
                roleRepository.save(new Role(null, "SELLER"));
            }
            if (roleRepository.findByName("ADMIN").isEmpty()) {
                roleRepository.save(new Role(null, "ADMIN"));
            }
        };
    }
}