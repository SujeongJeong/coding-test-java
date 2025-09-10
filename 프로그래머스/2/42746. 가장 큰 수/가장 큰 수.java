import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        // int -> String 배열로 전환
        String[] arr = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
        // 정렬
        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));
        
        // 첫 숫자가 0일 경우 처리
        if(arr[0].equals("0")) return "0";

        
        // 문자열 합치기
        StringBuilder result = new StringBuilder();
        for(String s : arr){
            result.append(s);
        }
         
        return result.toString();
    }
}