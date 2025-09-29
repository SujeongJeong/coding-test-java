import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int j = 0;
        List<Integer> temp = new ArrayList<>();
        // 이전 값과 같지 않으면 answer에 저장
        for(int i=0; i<arr.length; i++){
            if(i==0){
                temp.add(arr[0]);
            }else if(temp.get(j) != arr[i]){
                temp.add(arr[i]);
                j++;
            }
        }
         int[] answer = new int[temp.size()];
         for(int i=0; i<temp.size(); i++){
             answer[i] = temp.get(i);
         }
        return answer;
    }
}