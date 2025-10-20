package org.sysc4806.sysc4806_group20.Service;

import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.sysc4806.sysc4806_group20.BugBustersApplication;  // Import the BugBustersApplication config$

@SpringBootTest(classes = BugBustersApplication.class)  // Specify the configuration class
public class UserAccountServiceTest {

    @Test
    public void testSomeServiceMethod() {
        UserAccountService service = new UserAccountService();
    assertEquals(expected, service.someMethod());
    }
}
