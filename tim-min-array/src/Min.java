import java.util.Arrays;
import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SIZE;
        System.out.print("Nhập chiều dài mảng: ");
        SIZE = sc.nextInt();
        int[] arr = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Nhập phần tử thứ " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng được nhập: ");
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < SIZE; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất của mảng là: " + min);
    }
}
