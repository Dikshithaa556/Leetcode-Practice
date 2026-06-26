<<<<<<< HEAD
package Arrays.MissingNumber;
=======
package MissingNumber;
>>>>>>> 81bd859 (Convert Arrays from submodule to regular directory)

public class SumFormulaApproach {
    public int findNum(int[] nums){
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for(int num : nums){
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
