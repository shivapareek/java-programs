package Stacks;

import java.util.Stack;

public class ReverseRecursively {
    public static void pushAtBottom(int x , Stack<Integer> s){
        if(s.size()==0){
            s.push(x);
            return;
        }
        int top = s.pop();
        pushAtBottom(x,s);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.size()==1) return;
        int top = s.pop();
        reverse(s);
        pushAtBottom(top , s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        reverse(s);
        System.out.println(s);
    }
}
