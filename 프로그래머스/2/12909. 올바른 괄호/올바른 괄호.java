import java.util.Stack;

class Solution {
    boolean solution(String s) {
        
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<ch.length; i++){
            char c = ch[i];
            if(!stack.isEmpty() && stack.peek() == '(' && c == ')')
                stack.pop();
            else
                stack.push(c);
        }

        return stack.isEmpty();
    }
}