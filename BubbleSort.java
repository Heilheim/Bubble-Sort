import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 8, 3, 4, 2, 8, 5, 9};


        while (true) {
            int[] tempArray = new int[array.length];
            System.arraycopy(array, 0, tempArray, 0, array.length);
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }

            if (Arrays.equals(array, tempArray)) {
                break;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
