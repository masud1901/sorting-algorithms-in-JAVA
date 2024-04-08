import java.util.Arrays;

public class LeetCode268 {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3};
        int output = missingNumber(nums);
        System.out.println(output);
        System.out.println(Arrays.toString(nums));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        int length = nums.length;
        while (i < nums.length) {
            int current = nums[i];
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
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }
}
