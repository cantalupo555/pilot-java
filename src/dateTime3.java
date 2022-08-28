import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class dateTime3 {
    public static void main(String[] args) {
        // Convertendo Data-hora global para local

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        // Lista de todos os fusos disponíveis
        // for (String zone : ZoneId.getAvailableZoneIds())
        // System.out.println(zone);

        // Convertendo Instant (Global UTC 0)
        LocalDate d06SystemLocal = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate d06SystemPortugal = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime d06SystemLocalT = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime d06SystemPortugalT = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("d06SystemLocal = " + d06SystemLocal);
        // Instant > LocalDate > Texto
        System.out.println("d06SystemLocal = " + d06SystemLocal.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d06SystemPortugal = " + d06SystemPortugal);
        System.out.println("d06SystemLocalT = " + d06SystemLocalT);
        System.out.println("d06SystemPortugalT = " + d06SystemPortugalT);

        // Obter dados
        System.out.println("\nd04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println("\nd05 hora = " + d05.getHour());
        System.out.println("d05 minutos = " + d05.getMinute());
        System.out.println("d05 second = " + d05.getSecond());
    }
}
