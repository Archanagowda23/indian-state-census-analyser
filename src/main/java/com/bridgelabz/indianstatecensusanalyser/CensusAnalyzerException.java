package com.bridgelabz.indianstatecensusanalyser;

public class CensusAnalyzerException extends Exception {
    ExceptionType type;
    private String message;

    public CensusAnalyzerException(String message, ExceptionType type) {
        this.message = message;
        this.type = type;
    }

    enum ExceptionType {
        INDIA_CENSUS_CSV_PATH,
        INDIA_CENSUS_CSV_WRONG_FILETYPE,
        CSV_FILE_PROBLEM ,
        INDIA_STATE_CSV_WRONG_FILETYPE;
    }
}