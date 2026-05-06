package rs.milan.karajovic._32;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// _32) Find the age of a person in years if the birthday has given?

public class Java8Code
{
    public static void main(String[] args)
    {
        LocalDate birthDay = LocalDate.of(1985, 01, 23);
        LocalDate today = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(birthDay, today));
    }
}
