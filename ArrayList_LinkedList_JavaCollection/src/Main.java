import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductManager pr = new ProductManager();
        do {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            System.out.println("1: Add product");
            System.out.println("2: Update product");
            System.out.println("3: Delete product");
            System.out.println("4: Search product");
            System.out.println("5: Show info product");
            System.out.println("6: Sort product");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Enter id: ");
                    int id = Integer.parseInt(input.nextLine());
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    System.out.print("Enter cost: ");
                    int cost = Integer.parseInt(input.nextLine());
                    Product product = new Product(id, name, cost);
                    pr.add(product);
                    break;
                case 2:
                    System.out.print("Enter id:");
                    int id1 = Integer.parseInt(input.nextLine());
                    System.out.print("Enter name:");
                    String name1 = input.nextLine();
                    pr.update(id1, name1);
                    break;
                case 3:
                    System.out.print("Enter id: ");
                    int id2 = Integer.parseInt(input.nextLine());
                    pr.delete(id2);
                    break;
                case 4:
                    System.out.print("Enter name: ");
                    String name2 = input.nextLine();
                    pr.searchProduct(name2);
                    break;
                case 5:
                    pr.showProduct();
                    break;
                case 6:
                    System.out.println("1: Increase");
                    System.out.println("2: Decrease");
                    int num = Integer.parseInt(input.nextLine());
                    if (num == 1) {
                        Collections.sort(pr.products);
                    } else if (num == 2) {
                        Collections.sort(pr.products, new ComparatorCost());
                    }
                default:
                    break;
            }
        } while (true);

    }

}
