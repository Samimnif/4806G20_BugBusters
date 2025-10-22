package org.sysc4806.sysc4806_group20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "org.sysc4806.sysc4806_group20")
@EnableJpaRepositories(basePackages = "org.sysc4806.sysc4806_group20.Repository")
@EntityScan(basePackages = "org.sysc4806.sysc4806_group20.Model")
public class BugBustersApplication {

    public static void main(String[] args) {
        SpringApplication.run(BugBustersApplication.class, args);
    }
}

