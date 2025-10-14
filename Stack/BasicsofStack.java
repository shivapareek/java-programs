package Stacks;

import java.util.Stack;

public class BasicsofStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        System.out.println(s);

        //Peek
        System.out.println(s.peek());

        //Pop
        s.pop();
        System.out.println(s);

        //if empty
        System.out.println(s.isEmpty());

        //search
        System.out.println(s.search(3));

        //size
        System.out.println(s.size());
    }
}
