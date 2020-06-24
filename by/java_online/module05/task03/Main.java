/*
 * Создать класс Календарь с внутренним классом, с помощью объектов
 * которого можно хранить информацию о выходных и праздничных днях.
 *
 * Будем создавать календарь для работников на месяц.
 */

package by.java_online.module05.task03;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(5, 2020);
        calendar.createCalendarForMonth();

        calendar.addHoliday(1, "Labor Day", true);
        calendar.addHoliday(9, "Victory Day", true);
        calendar.addHoliday(12, "Day of the National Emblem and Flag of Belarus", false);

        calendar.printCalendar();
    }
}
