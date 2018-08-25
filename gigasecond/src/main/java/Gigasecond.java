import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class Gigasecond {
    LocalDateTime bday;
    LocalDateTime birthTime;

    Gigasecond(LocalDate birthDate) {
        bday = birthDate.atStartOfDay();
    }

    Gigasecond(LocalDateTime birthDateTime) {
        birthTime = birthDateTime;
    }

    LocalDateTime getDate() {
        if(bday != null)
            return bday.plus(1000000000, ChronoUnit.SECONDS);
        return birthTime.plus(1000000000, ChronoUnit.SECONDS);
    }

}
