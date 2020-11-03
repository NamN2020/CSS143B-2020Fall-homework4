package Problem1;
/*
    Nam Nguyen
    November 5, 2020
    CSS 143B
    Homework 4
 */

import java.util.Stack;

public class ReverseStack {
    public static void bottomFirst(Stack<Integer> stack, int bottom) {
        // base case
        if (stack.isEmpty()) {
            stack.push(bottom);
            return;
        }
        // keep popping stack until it is empty, than add the bottom first
        int top = stack.pop();
        bottomFirst(stack, bottom);

        // add back all the top values in correct order
        stack.push(top);
    }

    public static void reverseStack(Stack<Integer> stack) {
        // base case
        if(stack.isEmpty()){
            return;
        }

        // keep popping stack until empty to find the very bottom
        int bottom = stack.pop();
        reverseStack(stack);

        // first item popped is last item in new stack
        bottomFirst(stack, bottom);
    }
}