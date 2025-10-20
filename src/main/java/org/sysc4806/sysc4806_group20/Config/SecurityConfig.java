package org.sysc4806.sysc4806_group20.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// If you want this config only when a profile is active, uncomment the next line:
// import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
// If you decided earlier to keep security disabled by default, you can gate this config with a profile:
// @Profile("secure")
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // For demo: open everything. Tighten later if needed.
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/h2/**").permitAll()  // allow H2 console
                .anyRequest().permitAll()
            )
            .csrf(csrf -> csrf.disable())
            // allow H2 console frames
            .headers(h -> h.frameOptions(f -> f.disable()));

        return http.build();
    }
}

