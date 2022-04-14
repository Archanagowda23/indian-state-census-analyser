package com.bridgelabz.indianstatecensusanalyser;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.StreamSupport;

public class CensusAnalyzer {

    public void loadIndiaCensusData(String csvPath) throws CensusAnalyzerException {

        try (Reader reader = Files.newBufferedReader(Paths.get(csvPath))) {

            Iterator<IndiaCensusCSV> censusCSVIterator = getCSVIterator(reader, IndiaCensusCSV.class);
            getCount(censusCSVIterator);

        } catch (Exception e) {
            throw new CensusAnalyzerException(e.getMessage(), CensusAnalyzerException.ExceptionType.INCORRECT_HEADEREXCEPTION);
        }
    }

    //generic method
    private <E> Iterator getCSVIterator(Reader reader, Class csvClass) {
        CsvToBeanBuilder<E> csvCsvToBeanBuilder = new CsvToBeanBuilder<>(reader);
        csvCsvToBeanBuilder.withType(csvClass);
        csvCsvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
        CsvToBean<E> csvToBean = csvCsvToBeanBuilder.build();
        return csvToBean.iterator();
    }

    //generic method for count entries
    private <E> int getCount(Iterator<E> censusCSVIterator) {
        Iterable<E> csvIterator = () -> censusCSVIterator;
        int numOfEntries = (int) StreamSupport.stream(csvIterator.spliterator(), true).count();
        return numOfEntries;
    }
}