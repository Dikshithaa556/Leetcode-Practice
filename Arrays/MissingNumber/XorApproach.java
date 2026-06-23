package Arrays.MissingNumber;

public class XorApproach {
    public int findNum(int[] nums) {
        int xor = 0;
        int n = nums.length;

        for (int i = 0; i <= n; i++) {
            xor ^= i;
            xor ^= nums[i];
        }

        return xor;
    }
}
