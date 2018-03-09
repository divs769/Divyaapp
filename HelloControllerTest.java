package com.shopdirect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@WebMvcTest(HelloController.class)
public class HelloControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void shouldInvokeHelloReturnGreetings() throws Exception {
        mockMvc.perform(get("/hello/Divya")
                .contentType(MediaType.ALL)
                .content(""))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().string("Greetings from Divya"));

    }
}
