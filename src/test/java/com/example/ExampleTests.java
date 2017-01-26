package com.example;

import com.example.Controller.ProfileController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class ExampleTests {
    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new ProfileController()).build();
    }

    @Test
    public void checkRegisterView() throws Exception{
        this.mockMvc.perform(post("/User/profile").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .param("username", "uzytkownik")
                .param
        .andExpect(status().isOk())
                .andExpect(content().contentType("applicatin/json"));
    }
}
