import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        boolean answer = true;
        
        // 1. 정렬
        Arrays.sort(phone_book);
        
        // 2. 인접한 값과 비교
        for(int i = 0; i < phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}