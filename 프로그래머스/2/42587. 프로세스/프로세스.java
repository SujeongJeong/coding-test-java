import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        
        Queue<Integer> queue = new LinkedList<>();
        int[] orderedPri = priorities.clone();
        Arrays.sort(orderedPri);
        
        // 큐 지정
        for(int i=0; i<priorities.length; i++){
            queue.offer(i);
        }
        
        int cnt = 0;
        int j = orderedPri.length-1;
        while(!queue.isEmpty()){
            // 프로세스 꺼내기
            int i = queue.poll();
            int crntPriority = priorities[i];
            
            // 우선순위 확인
            if(crntPriority == orderedPri[j]){
                j--; 
                cnt++;
                if(location == i) break;
            }else{
                queue.offer(i);
            }
        }
        return cnt;
    }
}