package com.bridgelabz.indianstatecensusanalyser;

import com.opencsv.bean.CsvBindByName;

public class IndiaStateCSV {
    @CsvBindByName(column = "SrNo")
    private String srNo;

    @CsvBindByName(column = "State Name")
    private int stateName;

    @CsvBindByName(column = "TIN")
    private int tin;

    @CsvBindByName(column = "StateCode")
    public int stateCode;

}