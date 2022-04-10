package wrappers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateValue {

    private LocalDate date;

    public DateValue(String date) {
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        this.date = LocalDate.parse(date);
    }

    public static DateValue of(String date) {
        return new DateValue(date);
    }
}
