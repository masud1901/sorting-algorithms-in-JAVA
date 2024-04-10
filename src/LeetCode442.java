import java.util.ArrayList;
import java.util.List;

public class LeetCode442 {
    public static void main(String[] args) {
        int[] nums = {1};
        List<Integer> answer = findDuplicates(nums);
        System.out.println(answer);

    }

    public static List<Integer> findDuplicates(int[] nums) {
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

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int j = 0; j < length; j++) {
            if (nums[j] != j + 1) {
                numbers.add(nums[j]);
            }
        }
        return numbers;

    }
}
