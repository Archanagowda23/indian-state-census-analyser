package com.bridgelabz.indianstatecensusanalyser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CensusAnalyzerStateCodeTes {
    private static final String INDIA_CENSUS_CSV_PATH = "E:\\eclipseProgram\\untitled\\Census-Analyzer\\src\\main\\resources\\IndiaStateCode.csv";

    @Test
    public void givenIndianCensusCSVFileReturnsCorrectRecords() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            int numOfRecord = censusAnalyzer.loadIndiaStateCodeData(INDIA_CENSUS_CSV_PATH);
            Assert.assertEquals(37, numOfRecord);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }
}
