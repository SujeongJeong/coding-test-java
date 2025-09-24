import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        
        for(int[] num : sizes){        
                    
            int w = Math.max(num[0], num[1]);
            int h = Math.min(num[0], num[1]);
            
            max = Math.max(max, w);
            min = Math.max(min, h);
            System.out.println(max + " "+min);
        }
        
        
        return max*min;
    }
}