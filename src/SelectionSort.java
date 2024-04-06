import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 62, 3, 67, 23, 4, 13, 4, 22, 9, 0, 1, 3};

        System.out.printf(Arrays.toString(numbers));
        int[] answers = selectionSort(numbers);
        System.out.println();
        System.out.printf(Arrays.toString(answers));
    }

    static int[] selectionSort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;

        }

        return numbers;
    }
}
