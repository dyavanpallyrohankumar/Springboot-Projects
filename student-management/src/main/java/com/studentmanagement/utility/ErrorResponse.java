package com.studentmanagement.utility;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ErrorResponse {
    private LocalDateTime timestamp;
    private String error;
    private String message;
    private String path;
    private HttpStatus statusCode;
}
