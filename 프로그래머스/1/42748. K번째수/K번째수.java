import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
       
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i<=commands.length-1; i++){
            // 배열 자르기
            int[] part = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            
            // 정렬
            Arrays.sort(part);
            
            // k번째 값 저장
            result.add(part[commands[i][2]-1]);
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}