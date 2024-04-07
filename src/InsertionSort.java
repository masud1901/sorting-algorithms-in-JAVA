import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 7, 2, 2, 4, 5, 7, 2, 6, 2, 62, 53, 5, 35, 35, 31, 51, 775, 7, 90, 0, 0, -1, -242};
        System.out.printf(Arrays.toString(numbers));
        insertionSort(numbers);
        System.out.println();
        System.out.printf(Arrays.toString(numbers));
    }

    static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (numbers[j - 1] > numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
        }
    }
}
