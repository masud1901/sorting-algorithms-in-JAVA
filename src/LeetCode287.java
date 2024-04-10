public class LeetCode287 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};
        int output = findDuplicate(nums);
        System.out.println(output);
//        System.out.println(Arrays.toString(nums));
    }

    public static int findDuplicate(int[] nums) {
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

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return nums[j];
            }
        }
        return length;
    }
}
