package PurnaCollections;

import java.util.Stack;

public class StackLearn {

    public static void main(String[] args) {
        Stack<Integer> snm = new Stack<>();
        Stack sp = new Stack();
        snm.push(4);
        snm.push(6);
        snm.push(7);
        snm.push(0);
        snm.push(8);
        System.out.println(snm);
        System.out.println(snm.pop());
        System.out.println(snm.peek());
        System.out.println(snm);
        System.out.println(snm.search(6));
        System.out.println(sp.empty());
    }
}
