import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng thứ nhất:");
        int a = scanner.nextInt();
        int[] arr1 = new int[a];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + " : ");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Mảng thứ nhất: " + Arrays.toString(arr1));
        System.out.println("Nhập số lượng phần tử của mảng thứ hai:");
        int b = scanner.nextInt();
        int[] arr2 = new int[b];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + " : ");
            arr2[i] = scanner.nextInt();
        }
        System.out.println("Mảng thứ hai: " + Arrays.toString(arr2));
        int[] arr3 = new int[a + b];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i] = arr2[i];
        }
        System.out.println("Mảng sau khi gộp mảng thứ nhất và mảng thứ hai là: ");
        System.out.println(Arrays.toString(arr3));
    }
}
