package stack;

public class IntStack {
    private int[] arr;
    private int top;
    private int capactity;

    public IntStack(int size) {
        arr = new int[size];
        capactity = size;
        top = -1;
    }

    public int size(){
        return this.top + 1;
    }

    public void push(int val){
        if (this.isFull()) {
            System.out.println("Int Array is Full!");
            return;
        }
        arr[++top] = val;
    }

    public int pop(){
        if (this.isEmpty()){
            System.out.println("Int Array is empty!");
            System.exit(1);
        }
        return arr[top--];
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capactity - 1;
    }

    public String toString(){
        String output = new String();
        for (int i : this.arr){
            output += " " + i;
        }
        return output;
    }

}
