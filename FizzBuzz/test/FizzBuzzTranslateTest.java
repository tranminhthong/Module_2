import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTranslateTest {
    @Test
    void translate3() {
        int a = 3;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }

    @Test
    void translate5() {
        int a = 5;
        String expected = "Buzz";

        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }

    @Test
    void translate15() {
        int a = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }

    @Test
    void translate21() {
        int a = 21;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }

    @Test
    void translate55() {
        int a = 55;
        String expected = "Buzz";

        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }

    @Test
    void translate53() {
        int a = 53;
        String expected = "FizzBuzz";

        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }

    @Test
    void translate34() {
        int a = 34;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }

    @Test
    void translate56() {
        int a = 56;
        String expected = "Buzz";

        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }

    @Test
    void translate16() {
        int a = 16;
        String expected = "sixteen";

        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }

    @Test
    void translate74() {
        int a = 74;
        String expected = "seventy four";

        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }

    @Test
    void translate101() {
        int a = 101;
        String expected = "Can not translate number 101";

        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }
}
