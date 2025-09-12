/*
 중복 가능 -> HashMap
*/
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String, Integer> members = new HashMap<>();
        
        // 참가자 저장
        for(String p : participant){
            members.put(p, members.getOrDefault(p, 0) + 1);
        }
        
        // 참가자 중 완주자 제거
        for(String c : completion){
            members.put(c, members.get(c)-1);
        }
        
        StringBuilder result = new StringBuilder();
        for(String names : members.keySet()){
            if(members.get(names) != 0 )
                result.append(names);
        }        
        
        return result.toString();
    }
}
