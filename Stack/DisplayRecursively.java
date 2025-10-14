package Stacks;

import java.util.Stack;

public class DisplayRecursively {
    public static void display(Stack<Integer> st){
        if(st.size() == 0 ) return;
        int top = st.pop();
        display(st);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        display(s);
    }
}
