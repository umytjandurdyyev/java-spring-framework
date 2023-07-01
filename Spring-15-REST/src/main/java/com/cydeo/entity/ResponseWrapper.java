package com.cydeo.entity;

import lombok.*;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@NoArgsConstructor
public class ResponseWrapper {
    /**
     * Custom Json body
     */

    private boolean success;
    private String message;
    private  Integer code;
    private Object data;

    public ResponseWrapper(String message, Object data) {
        this.success = true;
        this.message = message;
        this.code = HttpStatus.OK.value();
        this.data = data;
    }

    public ResponseWrapper(String message) {
        this.message = message;
        this.code = HttpStatus.OK.value();
        this.success = true;
    }
}
