package org.sysc4806.sysc4806_group20;
import org.springframework.context.annotation.Configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

@Configuration
    exclude = {
        DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class,
        WebMvcAutoConfiguration.class
    }
)
public class TestSpring {
    public static void main(String[] args) {
        SpringApplication.run(TestSpring.class, args);
        System.out.println("Minimal Spring context loaded successfully.");
        System.exit(0);
    }
}
