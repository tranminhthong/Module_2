import java.util.Arrays;

public class NextDayCalculator {
    public static String nextDayCalculator(int day, int month, int year) {
        int nextDay = 0;
        int nextMonth = 0;
        int nextYear = 0;
        boolean isDayGreater0 = day > 0;
        boolean isDayLess31 = day < 31;
        boolean isMonthLess12 = month < 12;
        return nextDate(day, month, year, nextDay, nextMonth, nextYear, isDayGreater0, isDayLess31, isMonthLess12);
    }

    private static String nextDate(int day, int month, int year, int nextDay, int nextMonth, int nextYear, boolean isDayGreater0, boolean isDayLess31, boolean isMonthLess12) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (isDayGreater0 & isDayLess31) {
                    nextDay = day + 1;
                    nextMonth = month;
                    nextYear = year;
                } else if (day == 31) {
                    nextDay = 1;
                    if (isMonthLess12) {
                        nextMonth = month + 1;
                        nextYear = year;
                    } else {
                        nextMonth = 1;
                        nextYear = year + 1;
                    }
                }
            case 4:
            case 6:
            case 9:
            case 11:
                boolean isDayLess30 = day < 30;
                if (isDayGreater0 & isDayLess30) {
                    nextDay = day + 1;
                    nextMonth = month;
                    nextYear = year;
                } else {
                    boolean isDayEqual30 = day == 30;
                    if (isDayEqual30) {
                        nextDay = 1;
                        if (isMonthLess12) {
                            nextMonth = month + 1;
                            nextYear = year;
                        } else {
                            nextMonth = 1;
                            nextYear = year + 1;
                        }
                    }
                }
            case 2:
                boolean isLeapYear = year % 4 == 0;
                if (isLeapYear) {
                    if (isDayGreater0 & day < 29) {
                        nextDay = day + 1;
                        nextMonth = month;
                        nextYear = year;
                    } else {
                        boolean isDayEqual29 = day == 29;
                        if (isDayEqual29) {
                            nextDay = 1;
                            nextMonth = month + 1;
                            nextYear = year;
                        }
                    }
                } else {
                    boolean isDayLess28 = day < 28;
                    if (isDayGreater0 & isDayLess28) {
                        nextDay = day + 1;
                        nextMonth = month;
                        nextYear = year;
                    } else {
                        boolean isDayEqual28 = day == 28;
                        if (isDayEqual28) {
                            nextDay = 1;
                            nextMonth = month + 1;
                            nextYear = year;
                        }
                    }
                }
        }
        int[] nextDate = {nextDay, nextMonth, nextYear};
        return Arrays.toString(nextDate);
    }
}
