package guru.springframework.api.domain;

import lombok.Data;

import java.time.LocalDate;
import java.util.TimeZone;

@Data
public class ExpirationDate {

    private LocalDate date;
    private Integer timezoneType;
    private TimeZone timezone;

}
