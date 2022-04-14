package com.bridgelabz.indianstatecensusanalyser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CensusAnalyzerTest {


    private static final String INDIA_CENSUS_CSV_PATH_HEADER = "F:\\indian-state-census-analyzer\\src\\main\\resources\\IndiaStateCensusDataHeader.csv";

    //UseCase 1.5 Path is correct but in csv file header incorrect
    @Test
    public void givenIndianCensusCSVFileHaveIncorrectHeader() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            censusAnalyzer.loadIndiaCensusData(INDIA_CENSUS_CSV_PATH_HEADER);
            Assert.assertTrue(true, "Wrong header in csv file");
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }

    }
}