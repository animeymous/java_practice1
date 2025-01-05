public class QueueClass {

    //Queue implementation using fixed size Array
    int [] arr;
    int size, front, rear, capacity;

    // constructor to initialise the queue and its properties
    QueueClass(int limit){
        capacity = limit;
        arr = new int [limit];
        size = 0;
        rear = -1; // initially we will set rear as -1 and before moving we will increase
        front = 0; // our front will already set to point first index
    }

    // function to inject values in queue
    public void enqueue(int element){
        if(size == capacity){
            throw new RuntimeException("queue reached its capacity");
        }else{
            rear = (rear + 1) % capacity;
            arr[rear] = element;
            size++;
        }
    }

    // function to delete values from queue
    public void dequeue(){
        if(size == 0){
            throw new RuntimeException("queue is underflow");
        }else{
            front = (front + 1) % capacity;
            size--;
        }
    }

    // function to check if queue is empty or not
    public boolean isEmpty(){
        return size == 0;
    }

    // function to return peek or front element from the queue
    public int peek(){
        return arr[front];
    }

    // function to check if queue is full or not
    public boolean isFull(){
        return size == capacity;
    }

    // function to print values of queue
    public void printQueue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }else{
            for (int j : arr) {
                System.out.print(j + " ");
            }
        }
    }
}
