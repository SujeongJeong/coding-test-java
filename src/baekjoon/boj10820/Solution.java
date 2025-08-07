package baekjoon.boj10820;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException{
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;

        // 2. 한 줄씩 읽으며 분석
        while((line= br.readLine()) != null){
            int lower = 0, upper = 0, digit =0, space =0;

            for(int i = 0; i<line.length(); i++){
                char ch = line.charAt(i);

                if(Character.isLowerCase(ch)){
                    lower++;
                }else if(Character.isUpperCase(ch)){
                    upper++;
                }else if(Character.isDigit(ch)){
                    digit++;
                }else if(ch == ' '){
                    space++;
                }
            }
            System.out.println(lower + " " + upper + " "+ digit + " "+ space);
        }

    }
}