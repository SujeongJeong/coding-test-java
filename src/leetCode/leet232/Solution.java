package leetCode.leet232;

import java.util.Stack;

public class Solution {

    static class MyQueue {
        private Stack<Integer> inStack = new Stack<>();
        private Stack<Integer> outStack = new Stack<>();

        public void push(int x) {
            inStack.push(x);
        }

        public int pop() {
            shiftStacks();
            return outStack.pop();
        }

        public int peek() {
            shiftStacks();
            return outStack.peek();
        }

        public boolean empty() {
            return inStack.isEmpty() && outStack.isEmpty();
        }

        private void shiftStacks() {
            if (outStack.isEmpty()) {
                while (!inStack.isEmpty()) outStack.push(inStack.pop());
            }
        }


        public static void main(String[] args) {
            MyQueue q = new MyQueue();
            q.push(10);
            q.push(20);
            System.out.println(q.pop()); // 10
            q.push(30);
            q.push(40);
            System.out.println(q.pop()); // 20
            System.out.println(q.peek()); // 30
            System.out.println(q.empty()); // false
        }
    }

}
