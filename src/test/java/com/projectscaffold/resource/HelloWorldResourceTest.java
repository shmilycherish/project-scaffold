package com.projectscaffold.resource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloWorldResource.class)
class HelloWorldResourceTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    HelloWorldResource helloWorldResource;

    @Test
    void shouldReturnTrigramWhenTryToCreateATrigram() throws Exception {
        mockMvc.perform(
                        get("/hello-world/Ryan"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(MockMvcResultMatchers.jsonPath("$.welcomeMessage").value("Welcome Ryan"));
    }
}
