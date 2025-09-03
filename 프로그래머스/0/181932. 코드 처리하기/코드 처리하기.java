/* 
mode = 0
    code[idx] != 1 -> idx % 2 ==0, ret.append(code[idx])
    code[idx] == 1 -> mode = 1
mode = 1
    code[idx] != 1 -> idx % 2 != 0, ret.append(code[idx])
    code[idx] == 1 -> mode = 0
*/
class Solution {
    public String solution(String code) {
        
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        
        for(int i=0; i< code.length(); i++){
            char c = code.charAt(i);
            if(mode == 0){
                if(c != '1' && i % 2 == 0)
                    ret.append(c);
                else if( c == '1')
                    mode = 1;                    
            }else{
                if(c != '1' && i % 2 == 1)
                    ret.append(c);
                else if (c == '1')
                    mode = 0;
            }
        }        
        
        return ret.length() != 0? ret.toString() : "EMPTY";
    }
}