package org.sysc4806.sysc4806_group20.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
    // Handle "page not found" errors (404)
    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFound(NoHandlerFoundException ex, Model model) {
        model.addAttribute("errorTitle", "Page Not Found");
        model.addAttribute("errorMessage", "The page you are looking for does not exist.");
        return "error/404";
    }

    // Handle all other exceptions (500)
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleGeneralException(Exception ex, Model model) {
        model.addAttribute("errorTitle", "Internal Server Error");
        model.addAttribute("errorMessage", "Something went wrong. Please try again later.");
        // Optional: log exception details
        System.err.println("Unhandled exception: " + ex.getMessage());
        return "error/500";
    }
}
