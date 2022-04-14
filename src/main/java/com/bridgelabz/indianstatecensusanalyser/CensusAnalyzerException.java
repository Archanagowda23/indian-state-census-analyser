package com.bridgelabz.indianstatecensusanalyser;

public class CensusAnalyzerException extends Exception {
    ExceptionType type;
    private String message;

    public CensusAnalyzerException(String message, ExceptionType type) {
        this.message = message;
        this.type = type;
    }

    enum ExceptionType {
        INCORRECT_DELIMETEREXCEPTION;
    }
}