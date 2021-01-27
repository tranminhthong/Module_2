public class InsertionSort {
    void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j = j-1;
            }
            arr[j+1]=key;
        }
    }
    static void printArray(int[] arr){
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,11,13,5,6};
        System.out.println("Mảng ban đầu: ");
        printArray(arr);
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        System.out.println("\nMảng sau khi sắp xếp: ");
        printArray(arr);
    }
}
