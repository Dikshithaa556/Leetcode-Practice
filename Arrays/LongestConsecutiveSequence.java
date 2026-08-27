package Arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums){
        int count = 0;
        int longest = 0;
        int current = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        for(int num: set){
            if(!set.contains(num-1)){
                current = num;
                count = 1;
            }
            while(set.contains(current+1)){
                current++;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
