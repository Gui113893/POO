package aula05.Ex02;

public class Main {
    public static void main(String[] args) {
        DateYMD data = new DateYMD(2023, 1);

        data.addEvent(new DateYMD(14, 3, 2023));
        data.addEvent(new DateYMD(12, 3, 2023));
        data.addEvent(new DateYMD(1, 2, 2023));
        data.addEvent(new DateYMD(28, 9, 2023));
        data.addEvent(new DateYMD(7, 9, 2023));
        data.addEvent(new DateYMD(1, 1, 2023));
        data.addEvent(new DateYMD(10, 4, 2023));
        data.addEvent(new DateYMD(25, 5, 2023));
        data.addEvent(new DateYMD(25, 12, 2023));
        data.toString();
    }
}
