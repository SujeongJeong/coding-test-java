import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int length = nums.length;
        int count = length/2;
        
        HashSet<Integer> mons = new HashSet<>();
        
        for(int i = 0; i < length; i++){
            mons.add(nums[i]);
        }
        
        return mons.size() > count ? count : mons.size();
    }
}