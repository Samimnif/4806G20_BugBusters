package org.sysc4806.sysc4806_group20.Service;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.junit.jupiter.api.Test;
import org.sysc4806.sysc4806_group20.BugBustersApplication;  // Import the BugBustersApplication configuration class

@SpringBootTest(classes = BugBustersApplication.class)  // Specify the configuration class
@TestPropertySource(locations = "classpath:application-test.properties")
public class PasswordServiceTest {

    @Test
     public String encryptPassword(String password) {
        // Simple example of password encryption (use a more complex one in production)
        return "encrypted_" + password;
    }
}

