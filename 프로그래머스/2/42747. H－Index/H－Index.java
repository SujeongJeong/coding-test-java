import java.util.*;

class Solution {
    public int solution(int[] citations) {
        
        int n = citations.length;
        int answer = 0;
        
        // 정렬
        Arrays.sort(citations);
        
        // h값 찾기
        for(int i=0; i< n; i++){
            int h = n-i;
            if(citations[i] >= h){
                answer = h;
                break;
            }
        }
        
        return answer;
    }
}