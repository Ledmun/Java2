package lesson2.enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
    }

    public static String getWorkingHours(DayOfWeek dayOfWeek) {
        int hours = 0;
        if (dayOfWeek.getWorkingHours() > 0) {
            DayOfWeek[] weeks = DayOfWeek.values();
            for (int i = dayOfWeek.ordinal(); i < weeks.length; i++) {
                hours += weeks[i].getWorkingHours();
            }
        } else return "Выходной";

        return "До выходных осталось " + hours;
    }
}


