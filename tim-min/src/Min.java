public class Min {
    public static void main(String[] args) {
        int[] array = {324, 43, 562, 63, 234, 7, 324, 57, 345};
        int index = minValue(array);
        System.out.println("The smallest element in the array is: " + array[index] + " at position: " + index);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
