import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số muốn chèn vào mảng: ");
        int x = sc.nextInt();
        int index;
        while (true) {
            System.out.println("Nhập vị trí muốn chèn:");
            index = sc.nextInt();
            if (index <= 1 || index >= arr.length - 1) {
                System.out.println("Không thể chèn vào mảng. Mời nhập lại vị trí.");
            }
            break;
        }
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i]=arr[i];
        }
        newArray[index]=x;
        for (int i = index+1; i < newArray.length; i++) {
            newArray[i]=arr[i-1];
        }
        System.out.println("Mảng sau khi chèn "+x+" vào vị trí "+index+" là: ");
        System.out.println(Arrays.toString(newArray));
    }
}
