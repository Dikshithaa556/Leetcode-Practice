package Arrays.MissingNumber;

import java.util.Arrays;

public class SortingApproach {
    public int findNum(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
