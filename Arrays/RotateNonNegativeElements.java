package Arrays;

import java.util.ArrayList;
import java.util.List;

public class RotateNonNegativeElements {
    public int[] rotateElements(int[] nums, int k){
        int n = nums.length;
        List<Integer> list =  new ArrayList<>();
        for(int num: nums){
            if(num>=0){
                list.add(num);
            }
        }

        int m = list.size();
        if(m==0){
            return nums;
        }
        k = k%m;
        List<Integer> rotated = new ArrayList<>();
        for(int i=0; i<m; i++){
            rotated.add(list.get((i+k)%m));
        }

        int index = 0;
        for(int i=0; i<n; i++){
            if(nums[i]>=0){
                nums[i] = rotated.get(index++);
            }
        }
        return nums;
    }
}
