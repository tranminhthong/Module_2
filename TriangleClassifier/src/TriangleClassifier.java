public class TriangleClassifier {
    public static String triangleClassifier(int firstSide, int secondSide, int thirdSide) {
        String typeTriangle;
        boolean isNotTriangle1 = firstSide <= 0 || secondSide <= 0 || thirdSide <= 0;
        if (isNotTriangle1) {
            typeTriangle = "not a triangle";
        } else {
            boolean isNotTriangle2 = firstSide + secondSide <= thirdSide || firstSide + thirdSide <= secondSide || secondSide + thirdSide <= firstSide;
            if (isNotTriangle2) {
                typeTriangle = "not a triangle";
            } else {
                boolean isEquilateralTriangle = firstSide == secondSide & firstSide == thirdSide;
                if (isEquilateralTriangle) {
                    typeTriangle = "equilateral triangle";
                } else {
                    boolean isIsoscelesTriangle = firstSide == secondSide & firstSide != thirdSide || firstSide == thirdSide || secondSide == thirdSide;
                    if (isIsoscelesTriangle) {
                        typeTriangle = "isosceles triangle";
                    } else {
                        typeTriangle = "normal triangle";
                    }
                }
            }
        }
        return typeTriangle;
    }
}
