import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] scores = new int[3];
        
        for(int i = 0; i < answers.length ; i++){
            
            if(solveByP1(i+1, answers[i])) scores[0]++;
            if(solveByP2(i+1, answers[i])) scores[1]++;
            if(solveByP3(i+1, answers[i])) scores[2]++;
            
        }
        
        // 최댓값 찾기
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));

        // 최대 점수 받은 사람 찾기
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < scores.length; i++){
            if(max == scores[i])
                result.add(i+1);
        }
        
        // 배열로 변환
        int[] arr = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            arr[i] = result.get(i);
        }
        
        return arr;
    }
    
    private boolean solveByP1(int i, int answer){
        
        int answerByP1 = 5;
        
        if(i % 5 != 0) answerByP1 = i % 5;
                
        return answerByP1 == answer;
    }
    
    private boolean solveByP2(int i, int answer){
       
        int answerByP2 = 2;
        int[] base = {1,3,4,5};
        
        if(i % 2 == 0) answerByP2 = base[(i/2 - 1)% 4];
            
        return answerByP2 == answer;
        
    }
    
    private boolean solveByP3(int i, int answer){
        
        int[] base = {3,1,2,4,5};
        int baseIndex = ((i-1) % 10)/2;
        
        return base[baseIndex] == answer;
        
    }
}