import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        System.out.println("Instanciação de datas");

        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2023-03-03");
        LocalDateTime d05 = LocalDateTime.parse("2023-03-03T12:45:40");
        Instant d06 = Instant.parse("2023-03-03T12:45:40Z");
        Instant d07 = Instant.parse("2023-03-03T12:45:40-03:00");

        LocalDate d08 = LocalDate.parse("03/03/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("03/03/2023 12:45", fmt02);

        LocalDate d10 = LocalDate.of(2023, 03, 03);
        LocalDateTime d11 = LocalDateTime.of(2023, 03, 03, 12, 45);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);


        System.out.println("-----------------------------------------------------------");

        System.out.println("Formatação de datas para texto");

        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt04 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt05 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //formatter para dia/hora global;
        DateTimeFormatter fmt06 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt07 = DateTimeFormatter.ISO_INSTANT;

        // 3 possíveis maneiras
        System.out.println("d04 = " + d04.format(fmt03)); //chamar a data e depois formatar.
        System.out.println("d04 = " + fmt03.format(d04)); //chamar a formatação e depois a data.
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); //chamar a data e instaciar a formatação.

        // com hora
        System.out.println("d05 = " + d05.format(fmt03));
        System.out.println("d05 = " + d05.format(fmt04));

        System.out.println("d06 = " + fmt05.format(d06));

        System.out.println("d05 = " + fmt06.format(d05));
        System.out.println("d04 = " + fmt07.format(d06));
        System.out.println("d04 = " + d06.toString());


    }
}