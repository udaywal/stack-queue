package queue;

public class QueueWithArray {

    int[] arr;
    int front; // pointer to track the enqueue
    int rear; // pointer to track the dequeue
    int capacity;

    QueueWithArray (int capacity) {
        this.arr = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.capacity = capacity;
    }
    
    // isEmpty
    public boolean isEmpty() {
        return this.rear == -1;
    }
    
    // isFull
    public boolean isFull() {
        return (this.front + 1) % this.capacity == this.rear; // This will be only true in the case where rear=0 and front=n */
    }
    
    // Enqueue
    public void enqueue(int element) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is already full");
        }
        front = (front+1) % capacity;
        this.arr[front] = element;
    }

    // Dequeue
    public int dequeue() {
        return -1;
    }

}
