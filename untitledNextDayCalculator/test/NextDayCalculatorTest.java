import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class NextDayCalculatorTest {

    @Test
    void nextDayCalculator1and1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        int[] nextDate = {2, 1, 2018};
        String expected = Arrays.toString(nextDate);

        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void nextDayCalculator31and1() {
        int day = 31;
        int month = 1;
        int year = 2018;
        int[] nextDate = {1, 2, 2018};
        String expected = Arrays.toString(nextDate);

        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void nextDayCalculator30and4() {
        int day = 30;
        int month = 4;
        int year = 2018;
        int[] nextDate = {1, 5, 2018};
        String expected = Arrays.toString(nextDate);

        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void nextDayCalculator28and2() {
        int day = 28;
        int month = 2;
        int year = 2018;
        int[] nextDate = {1, 3, 2018};
        String expected = Arrays.toString(nextDate);

        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void nextDayCalculator29and2LeapYear() {
        int day = 29;
        int month = 2;
        int year = 2020;
        int[] nextDate = {1, 3, 2020};
        String expected = Arrays.toString(nextDate);

        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void nextDayCalculator31and12() {
        int day = 31;
        int month = 12;
        int year = 2018;
        int[] nextDate = {1, 1, 2019};
        String expected = Arrays.toString(nextDate);

        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected, result);
    }
}