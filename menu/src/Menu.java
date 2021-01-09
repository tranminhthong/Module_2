import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("4. Draw the tam giac");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice;
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Draw the triangle");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
            } else if (choice == 2) {
                System.out.println("Draw the square");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
            } else if (choice == 3) {
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
            } else if (choice == 4) {
                System.out.println("      *      ");
                System.out.println("    * * *    ");
                System.out.println("  * * * * *  ");
                System.out.println("* * * * * * *");

            }else if (choice == 0){
                System.exit(0);
            }else {
                System.out.println("No choice!");
            }
        }
    }
}
