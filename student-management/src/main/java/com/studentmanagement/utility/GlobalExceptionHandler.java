package com.studentmanagement.utility;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.studentmanagement.exception.ResourseNotFound;
import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourseNotFound.class)
    public ResponseEntity<?> handleResourseNotFound(ResourseNotFound e, HttpServletRequest request) {
        return new ResponseEntity<>(new ErrorResponse(LocalDateTime.now(), "Error From ResourseNotFound",
                e.getMessage(), request.getRequestURI(), HttpStatus.NOT_FOUND), HttpStatus.OK);
    }

}
