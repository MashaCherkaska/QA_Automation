package com.hillel.lessons.lesson16.exceptions;

import java.io.IOException;

public class MyException extends IOException {

    private String reason;

    public MyException(String reason) {
        this.reason = reason;
    }

    public MyException(String message, String reason) {
        super(message);
        this.reason = reason;
    }


    public String getReason() {
        return reason;
    }


}
