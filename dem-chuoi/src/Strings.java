import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String str = sc.nextLine();
        System.out.println("Nhập kí 1 kí tự muốn kiểm tra:");
        String key = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            String k = String.valueOf(str.charAt(i));
            if (k.equals(key)){
                count++;
            }
        }
        System.out.println("Kí tự '"+key+"' xuất hiện "+count+" lần trong chuỗi.");
    }
}
