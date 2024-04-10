public class LeetCode41 {
    public static void main(String[] args) {
        int[] nums = { 1};
        int answer = firstMissingPositive(nums);
        System.out.println(answer);
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        int length = nums.length;

        while (i < length) {
            int current = nums[i] - 1;
            if (current < 0 || current >= length) {
                i++;
            } else {

                if (nums[i] != nums[current]) {
                    int temp = nums[i];
                    nums[i] = nums[current];
                    nums[current] = temp;
                } else {
                    i++;
                }

            }


        }

        int answer = 0;

        for (int j = 0; j < length; j++) {
            if (nums[j] != j + 1) {
                answer = j + 1;
                return answer;
            }

        }
        return length+1;

    }
}
