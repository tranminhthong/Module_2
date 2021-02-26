import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Enter "+list.length+" values");
        for (int i = 0; i < size; i++) {
            System.out.println("Value "+i+": ");
            int x = sc.nextInt();
            list[i] = x;
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i]+"\t");
        }
        insertionSortByStep(list);

    }
    public  static void insertionSortByStep(int[] list){
        int n = list.length;
        for (int i = 0; i < n; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
            for (int k = 0; k < n; k++) {
                System.out.print(list[k]+" ");
            }
        }
    }

}
