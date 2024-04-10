import java.util.Arrays;

public class LeetCode645 {
    public static void main(String[] args) {
        int[] nums = {1,1};
        int[] answer = findErrorNums(nums);
        System.out.println(Arrays.toString(answer));

    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        int length = nums.length;
        while (i < length) {
            int current = nums[i] - 1;

            if (current == length) {
                i++;
            }
            if (nums[i] != nums[current]) {
                int temp = nums[i];
                nums[i] = nums[current];
                nums[current] = temp;
            } else {
                i++;
            }
        }

        int[] numbers = {0, 0};

        for (int j = 0; j < length; j++) {
            if (nums[j] != j + 1) {
                numbers[0] = nums[j];
                numbers[1] = j + 1;
            }
        }

        return numbers;
    }
}
