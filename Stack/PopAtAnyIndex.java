package Stacks;

import java.util.Stack;

public class PopAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        int indx = 2;
        System.out.println(s);
        Stack<Integer> s2 = new Stack<>();
        while (s.size() > indx){
            s2.push(s.pop());
        }
        s.pop();
        while (s2.size()>0){
            s.push(s2.pop());
        }
        System.out.println(s);
    }
}
