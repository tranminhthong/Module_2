import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn xóa: ");
        int x = sc.nextInt();
        int index_del = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Số bạn vừa nhập có trong mảng tại ví trí " + i);
                index_del = i;
                break;
            }
        }
        for (int i = index_del; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];

        }
        System.out.print("Mảng sau khi xóa "+x+" là: ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == arr.length - 2) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }

        }
    }
}
