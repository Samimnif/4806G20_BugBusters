package org.sysc4806.sysc4806_group20.Controller;

import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;

import org.sysc4806.sysc4806_group20.BugBustersApplication;  // Import the BugBustersApplication configuration class

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest(classes = BugBustersApplication.class)  // Specify the configuration class for the test
@AutoConfigureMockMvc
public class TopicProfRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllTopics() throws Exception {
        mockMvc.perform(get("/topics")  // Simulate an HTTP GET request to /topics
                .contentType(MediaType.APPLICATION_JSON))  // Set the content type to JSON
                .andExpect(status().isOk())  // Expect a 200 OK response
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));  // Expect JSON content
    }
}

