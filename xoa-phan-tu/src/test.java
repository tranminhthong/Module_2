import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,5,6,7,8,9,3,2,5,6};
        int x = 5;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==x){
                count++;
            }
        }
        int [] c = new int[a.length-count];
        for (int i = 0; i < c.length; i++) {

        }
        System.out.println(Arrays.toString(c));
    }
}
