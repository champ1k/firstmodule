package com.alevel.java.nix.datewizard;

import java.time.LocalDate;
public class SimpleDatewizard implements Datewizard{

    public LocalDate getDateOfYear(int year,int day)
    {
        return LocalDate.ofYearDay(year,day);
    }

}
