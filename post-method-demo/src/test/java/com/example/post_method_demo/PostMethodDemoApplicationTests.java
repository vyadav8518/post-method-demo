package com.example.post_method_demo;

import com.example.post_method_demo.dto.UserDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PostMethodDemoApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testValidUserRegistration() throws Exception {
        UserDTO validUser = new UserDTO();
        validUser.setName("John Doe");
        validUser.setEmail("john@example.com");
        validUser.setPassword("password123");

        mockMvc.perform(post("/api/users/register")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(validUser)))
            .andExpect(status().isOk());
    }

    @Test
    public void testInvalidUserRegistration() throws Exception {
        UserDTO invalidUser = new UserDTO();
        invalidUser.setName(""); // Invalid name
        invalidUser.setEmail("invalid-email"); // Invalid email
        invalidUser.setPassword("short"); // Invalid password

        mockMvc.perform(post("/api/users/register")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(invalidUser)))
            .andExpect(status().isBadRequest());
    }
}