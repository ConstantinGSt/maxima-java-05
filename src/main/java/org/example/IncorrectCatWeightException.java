package org.example;

public class IncorrectCatWeightException extends Exception {

    private String message = "Такое себе котэ";

    public String getMessage(){
        return message;
    }


}