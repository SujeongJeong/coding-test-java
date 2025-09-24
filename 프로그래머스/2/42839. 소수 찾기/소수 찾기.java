import java.util.*;

class Solution {
    public int solution(String numbers) {
        
        char[] num = numbers.toCharArray();
        // 사용 여부
        boolean[] used = new boolean[num.length];
        // 조합 만든 후 담기
        Set<Integer> comb = new HashSet<>();
        
        // 1. 조합 만들기
        makeCombination(0, used, num, comb);
        
        // 2. 소수 세기
        int count = 0;
        for (int x : comb){
            if(isPrime(x)) count++;
        }        
        
        return count;
    }
    
    private void makeCombination(int cur, boolean[] used, char[] num, Set<Integer> comb){
        if(cur != 0) comb.add(cur);
        
        Set<Character> seen = new HashSet<>();
        
        for(int i =0; i < num.length; i++){
            if(used[i]) continue;  // 사용한 숫자 제외
            char ch = num[i];
            if(seen.contains(ch)) continue;  // 중복 숫자 제외
            seen.add(ch);
                
            used[i] = true;
            int next = cur * 10 + (ch - '0');
            makeCombination(next, used, num, comb);
            used[i] = false;
        }
    }
    
    private boolean isPrime(int n){
        if(n < 2) return false;
        if(n == 2) return true;
        if(n%2 == 0) return false;
        for(int d = 3; d * d <=n; d+=2){
            if(n%d == 0) return false;
        }
        return true;
    }
}