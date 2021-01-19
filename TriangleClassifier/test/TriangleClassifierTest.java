import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {
    @Test
    void testTriangleClassifier222() {
        int firstSide = 2;
        int secondSide = 2;
        int thirdSide = 2;
        String expected = "equilateral triangle";
        String result = TriangleClassifier.triangleClassifier(firstSide, secondSide, thirdSide);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleClassifier223() {
        int firstSide = 2;
        int secondSide = 2;
        int thirdSide = 3;
        String expected = "isosceles triangle";
        String result = TriangleClassifier.triangleClassifier(firstSide, secondSide, thirdSide);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleClassifier345() {
        int firstSide = 3;
        int secondSide = 4;
        int thirdSide = 5;
        String expected = "normal triangle";
        String result = TriangleClassifier.triangleClassifier(firstSide, secondSide, thirdSide);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleClassifier823() {
        int firstSide = 8;
        int secondSide = 2;
        int thirdSide = 3;
        String expected = "not a triangle";
        String result = TriangleClassifier.triangleClassifier(firstSide, secondSide, thirdSide);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleClassifierNegative121() {
        int firstSide = -1;
        int secondSide = 2;
        int thirdSide = 1;
        String expected = "not a triangle";
        String result = TriangleClassifier.triangleClassifier(firstSide, secondSide, thirdSide);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleClassifier011() {
        int firstSide = 0;
        int secondSide = 1;
        int thirdSide = 1;
        String expected = "not a triangle";
        String result = TriangleClassifier.triangleClassifier(firstSide, secondSide, thirdSide);
        assertEquals(expected, result);
    }
}
