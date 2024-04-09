import java.util.ArrayList;
import java.util.List;

public class LeetCode448 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> output = findDisappearedNumbers(nums);
        System.out.println(output);
//        System.out.println(Arrays.toString(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        int length = nums.length;
        while (i < nums.length) {
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

        ArrayList<Integer> number = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                number.add(j+1);
            }
        }
        return number;
    }
}
