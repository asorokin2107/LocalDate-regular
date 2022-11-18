import java.util.Scanner;



public class FIO {
    public static void main(String[] args) {
        System.out.println("Введите ФИО: ");
        String fio = new Scanner(System.in).nextLine();

        if(fio.matches("(([А-я]+-)?([А-я]+)\\s){2}(([А-я]+-)?([А-я]+))")); {
            System.out.println("Фамилия:" + fio.substring(0, fio.indexOf(" ")));
            System.out.println("Имя: " + fio.substring(fio.indexOf(" "), fio.lastIndexOf(" ")).trim());
            System.out.println("Отчество: " + fio.substring(fio.lastIndexOf(" ")).trim());
        }

    }
}
