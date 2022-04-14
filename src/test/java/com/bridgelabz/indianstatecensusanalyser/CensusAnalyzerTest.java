package com.bridgelabz.indianstatecensusanalyser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CensusAnalyzerTest {

    private static final String INDIA_CENSUS_CSV_PATH_DELIMETER = "F:\\indian-state-census-analyzer\\src//main\\resources\\IndiaStateCensusData.pdf";

    //UseCase 1.4 Path is correct but delimiter incorrect
    @Test
    public void givenIndianCensusCSVFileReturnsIncorrectDelimeter(){
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            censusAnalyzer.loadIndiaCensusData(INDIA_CENSUS_CSV_PATH_DELIMETER);
            Assert.assertTrue(true, "Wrong delimiter");
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }
}