package by.java_online.module05.task03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
    int month;
    int year;
    private List<Day> days;

    private class Day {
        private int number;
        private String dayOfWeek;
        private String description;

        public Day(int number, String dayOfWeek, String description) {
            this.number = number;
            this.dayOfWeek = dayOfWeek;
            this.description = description;
        }

        public int getNumber() {
            return number;
        }

        public String getDescription() {
            return description;
        }

        public String getDayOfWeek() {
            return dayOfWeek;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public Calendar(int month, int year) {
        this.year = year;
        this.month = month;
        days = new ArrayList<>();
    }

    public void createCalendarForMonth() {
        int day = 1;
        LocalDate date = LocalDate.of(year, month, day);

        while (date.getMonthValue() == month) {
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY | date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                days.add(new Day(date.getDayOfMonth(), date.getDayOfWeek().toString(), TypeOfDay.DAY_OFF.toString()));
            } else {
                days.add(new Day(date.getDayOfMonth(), date.getDayOfWeek().toString(), TypeOfDay.WORKDAY.toString()));
            }

            date = date.plusDays(1);
        }
    }

    public void addHoliday(int dayNumber, String holidayName, boolean isDayOff) {
        for (Day day : days) {
            if (day.getNumber() == dayNumber) {
                if (isDayOff) {
                    day.setDescription(TypeOfDay.DAY_OFF.toString() + " - '" + holidayName + "'");
                } else {
                    day.setDescription(TypeOfDay.WORKDAY.toString() + " - '" + holidayName + "'");
                }
            }
        }
    }

    public void printCalendar() {
        System.out.print("Calendar for ");
        printElement(month);
        System.out.println("." + year + ":");
        System.out.println("----------------------------");

        for (Day day : days) {
            printElement(day.getNumber());
            System.out.print("(" + day.getDayOfWeek() + ") - " + day.getDescription() + ";\n");

        }
    }

    public void printElement(int element) {
        if (element >= 10) {
            System.out.print(element);
        } else {
            System.out.print("0" + element);
        }
    }
}