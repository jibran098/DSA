package codingninjas.queue;

public class NormalQueue {
    int[] data;
    int front;
    int size;

    public NormalQueue(int len) {
        data = new int[len];
        front = 0;
        size = 0;
    }
    private void add(int element) {
        if(size == data.length) {
            System.out.println("Queue Over Flow Error");
        } else {
            //Now: suppose you removed 2 elements from start, so size becomes = 3 out of 5
            // So this.data[3] -> this position will be changed which is wrong
            // So use front, to find the position to add, it will be front + size
            // int rear = front + size;
            // If 2 elements are removed, rear= 2 + 3 = 5 this index exceeds, so do cyclic
            // 2 + 3 = 5 -> 5%5 -> 0th position
            int rear = (front + size) % data.length; // so index would start from 0 again.
            this.data[rear] = element;
            size++;
        }
    }

    private int peek() {
        return data[front];
    }

    private int remove(){
        if(size<1) {
            System.out.println("Queue Under Flow Error");
            return -1;
        } else {
            front = front % data.length;
            int value = data[front];
            front++;
            size--;
            return value;
        }
    }

    private void display() {
        for(int i=0; i<data.length; i++) {
            // If you display data[i], it may print in false order because if you removed from
            // added new at the position, but they must not be served first.
            // so use front to print the values.
            int idx = front + i;
            System.out.print(data[idx] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        NormalQueue queue = new NormalQueue(5);
        queue.add(10);
    }
}
