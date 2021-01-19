public class FizzBuzzTranslate {
    public static String translate(int number) {
        String displayString = null;
        String str = "";
        String numberToString = Integer.toString(number);

        boolean isDivisible3and5 = number % 3 == 0 && number % 5 == 0;
        boolean isExist3and5 = numberToString.contains("3") && numberToString.contains("5");
        if (isDivisible3and5 || isExist3and5) {
            displayString = "FizzBuzz";
        } else if (number > 100) {
            displayString = "Can not translate number " + number;
        } else {
            boolean isDivisibleOrExist3 = number % 3 == 0 || numberToString.contains("3");
            if (isDivisibleOrExist3) {
                displayString = "Fizz";
            } else {
                boolean isDivisibleOrExist5 = number % 5 == 0 || numberToString.contains("5");
                if (isDivisibleOrExist5) {
                    displayString = "Buzz";
                } else {
                    if (number > 0 && number < 10) {
                        displayString = getUnit(number, str);
                    } else if (number > 9 && number < 20) {
                        switch (number) {
                            case 11:
                                displayString = "eleven";
                                break;
                            case 14:
                                displayString = "fourteen";
                                break;
                            case 16:
                                displayString = "sixteen";
                                break;
                            case 17:
                                displayString = "seventeen";
                                break;
                            case 19:
                                displayString = "nineteen";
                                break;
                        }
                    } else if (number > 19) {
                        int original = number / 10;
                        int residual = number % 10;
                        switch (original) {
                            case 2:
                                displayString = "twenty " + getUnit(residual, str);
                                break;
                            case 4:
                                displayString = "forty " + getUnit(residual, str);
                                break;
                            case 6:
                                displayString = "sixty " + getUnit(residual, str);
                                break;
                            case 7:
                                displayString = "seventy " + getUnit(residual, str);
                                break;
                            case 8:
                                displayString = "eighty " + getUnit(residual, str);
                                break;
                            case 9:
                                displayString = "ninety " + getUnit(residual, str);
                                break;
                        }
                    }
                }
            }
        }
        return displayString;
    }

    private static String getUnit(int number, String str) {
        switch (number) {
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 4:
                str = "four";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
        }
        return str;
    }
}
