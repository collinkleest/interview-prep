package queue;

public class IntQueue {

    private int[] ar;
    private int front, end, sz;

    public IntQueue(int size){
        this.front = this.end = 0;
        this.sz = size + 1;
        this.ar = new int[this.sz];
    }

    public boolean isEmpty(){
        return front == end;
    }

    public int size(){
        if (front > end) return (end + sz - front);
        return end - front;
    }

    public void enQueue(int val){
        ar[end] = val;
        if (++end == sz) front = 0;
        if (end  == front) throw new RuntimeException("Queue is too small");
    }

}
