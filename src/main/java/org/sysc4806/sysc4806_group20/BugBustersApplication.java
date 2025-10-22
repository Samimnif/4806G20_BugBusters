package org.sysc4806.sysc4806_group20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class BugBustersApplication {
    public static void main(String[] args) {
        SpringApplication.run(BugBustersApplication.class, args);
    }
}
