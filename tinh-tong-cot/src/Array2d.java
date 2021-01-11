import java.util.Arrays;
import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng 2  chiều");
        int a = sc.nextInt();
        System.out.println("Nhập độ dài các phần tử của mảng 2 chiều:");
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("Nhập phần tử thứ " + j + " của phần tử thứ " + i + " của mảng 2 chiều: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));

        for (int j = 0; j < b; j++) {
            int total = 0;
            for (int i = 0; i < a; i++) {
                total += arr[i][j];
            }
            System.out.println("Tổng cột thứ "+j+" là: "+total);
        }
    }
}
