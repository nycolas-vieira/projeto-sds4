package com.devsuperior.dsvendas.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice(annotations = RestController.class)
public class ApiExceptionControllerAdvice {

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiError handleException(Exception ex) {
        return new ApiError(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                ex.getMessage(),
                ex.toString()
        );
    }


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({
            BadRequestException.class
    })

    @ResponseBody
    public ApiError badRequest(Exception ex) {
        return new ApiError(
                HttpStatus.BAD_REQUEST.value(),
                ex.getMessage(),
                ex.toString()
        );
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({
            NotFoundException.class
    })
    @ResponseBody
    public ApiError notFoundRequest(Exception ex) {
        return new ApiError(
                HttpStatus.NOT_FOUND.value(),
                ex.getMessage(),
                ex.toString()
        );
    }
}