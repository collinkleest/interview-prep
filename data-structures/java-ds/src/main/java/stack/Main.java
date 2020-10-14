package stack;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        IntStack intStack = new IntStack(5);
        intStack.push(1);
        intStack.push(2);
        System.out.println(intStack.toString());

        System.out.println("LL STACK");
        Stack stack = new Stack(1);
        stack.push(5);
        stack.push(100);
        stack.push(12);
        Iterator itr = stack.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        stack.pop();
        Iterator newItr = stack.iterator();
        System.out.println("");
        while (newItr.hasNext()){
            System.out.print(newItr.next() + " ");
        }
    }
}
