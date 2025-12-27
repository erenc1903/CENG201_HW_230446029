// This class implements a Queue using a Linked List structure
public class TreatmentQueue {

    // Node class represents each element in the queue
    private class Node {
        TreatmentRequest data; // Treatment request data
        Node next;             // Reference to next node

        Node(TreatmentRequest data) {
            this.data = data;
            this.next = null;
        }
    }

    // Front of the queue (first element)
    private Node front;

    // Rear of the queue (last element)
    private Node rear;

    // Number of elements in the queue
    private int size;

    // Constructor initializes an empty queue
    public TreatmentQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    // Adds a new treatment request to the end of the queue
    public void enqueue(TreatmentRequest request) {
        Node newNode = new Node(request);

        // If queue is empty, front and rear are the same
        if (rear == null) {
            front = rear = newNode;
        } else {
            // Add new node to the end and update rear
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Removes and returns the first treatment request (FIFO)
    public TreatmentRequest dequeue() {
        // If queue is empty, return null
        if (front == null) {
            return null;
        }

        // Store removed data
        TreatmentRequest removedRequest = front.data;

        // Move front to next node
        front = front.next;

        // If queue becomes empty, rear must be null
        if (front == null) {
            rear = null;
        }

        size--;
        return removedRequest;
    }

    // Returns the current size of the queue
    public int size() {
        return size;
    }

    // Prints all treatment requests in the queue
    public void printQueue() {
        Node current = front;

        // Traverse queue from front to rear
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

