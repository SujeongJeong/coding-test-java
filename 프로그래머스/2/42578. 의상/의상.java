import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        int answer = 1; 
        HashMap<String, Integer> categories = new HashMap<>();
        
        // 카테고리별 개수 저장
        for(int i = 0; i < clothes.length; i++){
            String key = clothes[i][1];
            
            categories.put(key, categories.getOrDefault(key, 0) + 1);
        }
        
        // 계산
        for(int cnt : categories.values()){
            answer *= (cnt +1);
        }
        
        return answer - 1;
    }
}