package com.alevel.java.nix.datewizard;

import java.time.LocalDate;
import java.util.Date;

public class ProgrammersDayService {
    public static final int PROGGRAMMERSDAY = 256;

    private final Datewizard datewizard;

    public ProgrammersDayService(Datewizard datewizard)

    {
        this.datewizard = datewizard;
    }
    public LocalDate getProgrammingDay(int year)
    {
        return datewizard.getDateOfYear(year,PROGGRAMMERSDAY);
    }
}
