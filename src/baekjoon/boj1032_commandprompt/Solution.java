package baekjoon.boj1032_commandprompt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 파일 개수
        String[] filenames = new String[n];

        for(int i=0; i<n; i++){
            filenames[i] = br.readLine();
        }

        // 파일이 하나일 경우 바로 출력
        if(n == 1 ){
            System.out.println(filenames[0]);
            return;
        }

        // 최종 패턴 담을 StringBuilder
        StringBuilder pattern = new StringBuilder();

        for(int i=0; i < filenames[0].length(); i++){
            char currentChar = filenames[0].charAt(i); // 첫번재 파일 이름
            boolean allSame = true;

            for(int j = 1; j < n; j++){
                if(filenames[j].charAt(i) != currentChar){
                    allSame = false;
                    break;
                }
            }

            pattern.append(allSame ? currentChar : '?');
        }

        // 출력
        System.out.println(pattern.toString());

    }
}
