package com.example.post_method_demo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor // Add this annotation to create a no-args constructor
@AllArgsConstructor // This will create a constructor with all fields
public class ErrorResponse {
    private int status;
    private String message;
    private List<String> errors;

    // Constructors you were using before
    public ErrorResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }
}