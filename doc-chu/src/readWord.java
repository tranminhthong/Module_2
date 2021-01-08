import java.util.Scanner;

public class readWord {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        System.out.println("Nhap  so can doc: ");
        int num = so.nextInt();
        int a, b;
        if (num >= 0 && num < 10) {
            String e;
            switch (num) {
                case 0:
                    e = "zero";
                    break;
                case 1:
                    e = "one";
                    break;
                case 2:
                    e = "two";
                    break;
                case 3:
                    e = "three";
                    break;
                case 4:
                    e = "four";
                    break;
                case 5:
                    e = "five";
                    break;
                case 6:
                    e = "six";
                    break;
                case 7:
                    e = "seven";
                    break;
                case 8:
                    e = "eight";
                    break;
                case 9:
                    e = "nine";
                    break;
                default:
                    e = "out  of ability";
                    break;
            }
            System.out.println(e);
        } else if (num < 20) {
            a = num % 10;
            String j = null;
            switch (a) {
                case 0:
                    j = "ten";
                    break;
                case 1:
                    j = "eleven";
                    break;
                case 2:
                    j = "twelve";
                    break;
                case 3:
                    j = "thirteen";
                    break;
                case 4:
                    j = "fourteen";
                    break;
                case 5:
                    j = "fifteen";
                    break;
                case 6:
                    j = "sixteen";
                    break;
                case 7:
                    j = "seventeen";
                    break;
                case 8:
                    j = "eighteen";
                    break;
                case 9:
                    j = "nineteen";
                    break;
            }
            System.out.println(j);
        } else if (num < 100) {
            a = num / 10;
            b = num % 10;
            String c = null, d = null;
            switch (a) {
                case 2:
                    c = "twenty";
                    break;
                case 3:
                    c = "thirty";
                    break;
                case 4:
                    c = "forty";
                    break;
                case 5:
                    c = "fifty";
                    break;
                case 6:
                    c = "sixty";
                    break;
                case 7:
                    c = "seventy";
                    break;
                case 8:
                    c = "eighty";
                    break;
                case 9:
                    c = "ninety";
                    break;
            }
            switch (b) {
                case 0:
                    d = "";
                    break;
                case 1:
                    d = "one";
                    break;
                case 2:
                    d = "two";
                    break;
                case 3:
                    d = "three";
                    break;
                case 4:
                    d = "four";
                    break;
                case 5:
                    d = "five";
                    break;
                case 6:
                    d = "six";
                    break;
                case 7:
                    d = "seven";
                    break;
                case 8:
                    d = "eight";
                    break;
                case 9:
                    d = "night";
                    break;
            }
            System.out.println(c + " " + d);
        } else if (num < 1000) {
            a = num / 100;
            b = num % 100 / 10;
            int c = num % 100 % 10;
            String d = null, e = null, f = null;
            switch (a) {
                case 1:
                    d = "one hundred";
                    break;
                case 2:
                    d = "two hundred";
                    break;
                case 3:
                    d = "three hundred";
                    break;
                case 4:
                    d = "four hundred";
                    break;
                case 5:
                    d = "five hundred";
                    break;
                case 6:
                    d = "six hundred";
                    break;
                case 7:
                    d = "seven hundred";
                    break;
                case 8:
                    d = "eight hundred";
                    break;
                case 9:
                    d = "nine hundred";
                    break;

            }
            if (b == 1) {
                String j = null;
                switch (c) {
                    case 0:
                        j = "ten";
                        break;
                    case 1:
                        j = "eleven";
                        break;
                    case 2:
                        j = "twelve";
                        break;
                    case 3:
                        j = "thirteen";
                        break;
                    case 4:
                        j = "fourteen";
                        break;
                    case 5:
                        j = "fifteen";
                        break;
                    case 6:
                        j = "sixteen";
                        break;
                    case 7:
                        j = "seventeen";
                        break;
                    case 8:
                        j = "eighteen";
                        break;
                    case 9:
                        j = "nineteen";
                        break;
                }
                System.out.println(d + " " + j);
            }
            else {
                switch (b) {
                    case 0:
                        e = "";
                        break;
                    case 2:
                        e = "twenty";
                        break;
                    case 3:
                        e = "thirty";
                        break;
                    case 4:
                        e = "forty";
                        break;
                    case 5:
                        e = "fifty";
                        break;
                    case 6:
                        e = "sixty";
                        break;
                    case 7:
                        e = "seventy";
                        break;
                    case 8:
                        e = "eighty";
                        break;
                    case 9:
                        e = "ninety";
                        break;
                }
                switch (c) {
                    case 0:
                        f = "";
                        break;
                    case 1:
                        f = "one";
                        break;
                    case 2:
                        f = "two";
                        break;
                    case 3:
                        f = "three";
                        break;
                    case 4:
                        f = "four";
                        break;
                    case 5:
                        f = "five";
                        break;
                    case 6:
                        f = "six";
                        break;
                    case 7:
                        f = "seven";
                        break;
                    case 8:
                        f = "eight";
                        break;
                    case 9:
                        f = "night";
                        break;
                }
                    System.out.println(d + " and " + e + " " + f);
            }
        }
    }
}

