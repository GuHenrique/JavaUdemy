import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.IntSummaryStatistics;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2023-03-03");
        LocalDateTime d02 = LocalDateTime.parse("2023-03-03T12:45:20");
        Instant d03 = Instant.now();




        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);

        System.out.println("Conversão");
        System.out.println("--------------------------------");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant (d03, ZoneId.of("Australia/Melbourne"));


        DateTimeFormatter ptBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("Brazil/East"));
        DateTimeFormatter aust = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm").withZone(ZoneId.of("Australia/Melbourne"));


        System.out.println("r1 = " + r1);
        System.out.println("r3 = " + r3.format(aust));

        //pegar a data/hora individualmente

        System.out.println("Dia = " + r3.getDayOfMonth());
        System.out.println("Mes = " + r3.getMonthValue());
        System.out.println("Ano = " + r3.getYear());
        System.out.println("Hora = " + r3.getHour());


        //Calculos com data/hora

        System.out.println("------------------- Calculos com Data/Hora -------------------");

        LocalDate d04 = LocalDate.now();
        LocalDate pastWeekLocalDate = d04.minusWeeks(1);
        LocalDate nextWeekLocalDate = d04.plusWeeks(1);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("------------------- Local Date -------------------");
        System.out.println("Actual date = " + fmt1.format(d04));
        System.out.println("Past week = " + fmt1.format(pastWeekLocalDate));
        System.out.println("Next week = " + fmt1.format(nextWeekLocalDate));

        LocalDateTime d05 = LocalDateTime.now();
        LocalDateTime pastWeekLocalDateTime = d05.minusWeeks(1);
        LocalDateTime nextWeekLocalDateTime = d05.plusWeeks(1);

        System.out.println("------------------- Local Date Time -------------------");
        System.out.println("Actual date = " + fmt2.format(d05));
        System.out.println("Past week = " + fmt2.format(pastWeekLocalDateTime));
        System.out.println("Next week = " + fmt2.format(nextWeekLocalDateTime));

        Instant d06 = Instant.now();
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("------------------- Instant -------------------");
        System.out.println("Actual date = " + fmt3.format(d06));
        System.out.println("Past week = " + fmt3.format(pastWeekInstant));
        System.out.println("Next week = " + fmt3.format(nextWeekInstant));

        System.out.println("------------------- Cálculo de tempo entre datas -------------------");


        // Duration t1 = Duration.between(pastWeekLocalDate, d04); // Não é possíve fazer a conta com LocalDate, pois ele não tem o tempo em horas, minutos, segundos
        // é necessário fazer uma conversão do localdate, adicionando a hora/minuto.
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, nextWeekInstant);

        System.out.println("Days t1: " + t1.toDays());
        System.out.println("Days t2: " + t2.toDays());
        System.out.println("Days between weeks t3: " + t3.toDays());
        }
    }
