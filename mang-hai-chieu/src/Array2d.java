public class Array2d {
    public static void main(String[] args) {
        int[][] arr = {
                {312, 34, 412},
                {-213, 4324, 3},
                {432, 21, 100}
        };
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
