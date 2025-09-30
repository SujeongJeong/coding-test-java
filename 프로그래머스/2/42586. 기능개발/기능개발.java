import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        int pSize = progresses.length;
        int[] done = new int[pSize];
        
        // 해당 기능이 완성되는 일 수
        for(int i=0; i < pSize;i++){
            done[i] = (int) Math.ceil((100-progresses[i])/(double)speeds[i]);
        }
        
        ArrayList<Integer> temp = new ArrayList<>();
        int max = done[0];
        int count = 1;
        int len = done.length;
        for(int i=1; i < len; i++){
            if(max >= done[i]) count++;
            else {
                temp.add(count);
                count = 1;
                max = done[i];
            }
        }
        temp.add(count);
        
        int[] answer = new int[temp.size()];
        for(int i =0; i< temp.size(); i++){
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}