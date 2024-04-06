import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 3, 2, 4, 3, 1, 1, 9, 8, 7, 0, 7, 6};
//        int[] numbers = {0, 1, 1, 2, 3, 3, 3, 4, 4, 6, 7, 7, 8, 9};


//        int[] numbers = {9, 8, 7, 7, 6, 4, 4, 3, 3, 3, 2, 1, 1, 0};
        int[] answer = bubbleSort(numbers);
//        int[] nums = {9, 8, 7, 7, 6, 4, 4, 3, 3, 3, 2, 1, 1, 0};
        int[] nums = {3, 4, 3, 2, 4, 3, 1, 1, 9, 8, 7, 0, 7, 6};

        int[] solution = optimizedBubbleSort(nums);
        System.out.println(Arrays.toString(answer));
    }

    static int[] bubbleSort(int[] numbers) {
        int comparisions = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    comparisions++;
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Total Comparisions: " + comparisions);

        return numbers;
    }

    static int[] optimizedBubbleSort(int[] numbers) {
        int comparisons = 0;
        boolean swapped;
        for (int i = 0; i < numbers.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    comparisons++;
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        System.out.println("Total Comparisons: " + comparisons);
        return numbers;
    }
}
