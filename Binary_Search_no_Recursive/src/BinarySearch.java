public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("key 2 has index = " + binarySearch(list, 2));
        System.out.println("key 11 has index = " + binarySearch(list, 11));
        System.out.println("key 79 has index = " + binarySearch(list, 79));
        System.out.println("key 1 has index = " + binarySearch(list, 1));
        System.out.println("key 5 has index = " + binarySearch(list, 5));
        System.out.println("key 80 has index = " + binarySearch(list, 80));
    }
}
