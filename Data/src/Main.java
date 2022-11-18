import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year = getDateChunk("Введите Год");
        int month = getDateChunk("Введите Месяц");
        int day = getDateChunk("Введите День");

        String str = collectBirthday(year, month, day);
        System.out.println(str);
    }

    public static int getDateChunk(String title) {
        System.out.println(title);
        return new Scanner(System.in).nextInt();
    }

    public static String collectBirthday (int year, int month, int day) {
        String bdString = "";

        LocalDate bdDate = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy - EEE", Locale.US);

        for (int i = 0; bdDate.isBefore(now); i++) {
            bdString = bdString + i + " " + bdDate.format(dtf) + "\n";
            bdDate = bdDate.plusYears(1);
        }

        return bdString;
    }


}

