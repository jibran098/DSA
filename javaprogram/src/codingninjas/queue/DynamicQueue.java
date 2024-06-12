package codingninjas.queue;

public class DynamicQueue {
    int[] data;
    int front;
    int size;

    public DynamicQueue(int Initialcap) {
        this.data = new int[Initialcap];
        this.front = 0;
        this.size = 0;
    }

    public void display() {
        for(int i=0; i<size; i++) {
            int idx = (front + i) % data.length;
            System.out.print(data[idx] + " ");
        }
        System.out.println();
    }

    private void add(int element) {
        if(size == data.length) {
            int[] newData = new int[2 * data.length];
            for(int i=0; i<size; i++) {
                int idx = front + i;
                newData[i] = data[idx];
            }
            data = newData;
            front = 0;
        } else {
            int rear = (front + size) % data.length;
            data[rear] = element;
            size++;
        }
    }

    private int remove() {
        if(size < 1) {
            System.out.println("Queue UnderFlow Error");
            return -1;
        } else {
            front = front % data.length;
            size--;
            front++;
            return data[front];
        }
    }
    private int peek() {
        if(size < 1) {
            System.out.println("Queue UnderFlow Error");
            return -1;
        }
        return data[front];
    }
    public static void main(String[] args) {
        DynamicQueue dq = new DynamicQueue(5);
        dq.peek();
        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);
        dq.add(50);
        dq.display();
        dq.remove();
        dq.remove();
        dq.display();
        dq.add(1);
        dq.add(2);
        dq.display();

    }
}
