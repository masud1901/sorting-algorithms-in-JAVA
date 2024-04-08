import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 1, 5, 6, 9, 7, 8};
        System.out.printf(Arrays.toString(numbers));
        cycleSort(numbers);
        System.out.println();
        System.out.printf(Arrays.toString(numbers));
    }

    static void cycleSort(int[] numbers) {
        int i = 0;
        while (i < numbers.length) {
            int correctIndex = numbers[i] - 1;
            if (numbers[i] != numbers[correctIndex]) {
                int temp = numbers[i];
                numbers[i] = numbers[correctIndex];
                numbers[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }
}
