package Stacks;

import java.util.Stack;

public class CopyStackInSameOrder {
    public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        Stack<Integer> s2 = new Stack<>();
        while (s.size()>0){
            s2.push(s.pop());
        }
        System.out.println(s2);
        Stack<Integer> s3 = new Stack<>();
        while (s2.size()>0){
            s3.push(s2.pop());
        }
        System.out.println(s3);

    }


}
