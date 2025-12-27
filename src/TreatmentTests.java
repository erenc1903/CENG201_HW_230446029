// Main class to test the TreatmentQueue
public class TreatmentTests {

    public static void main(String[] args) {

        // Create a new treatment queue
        TreatmentQueue queue = new TreatmentQueue();

        // Add 8 treatment requests to the queue
        for (int i = 1; i <= 8; i++) {
            queue.enqueue(new TreatmentRequest(i));
        }

        // Process (remove) first 3 requests
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        // Print remaining requests in the queue
        System.out.println("Remaining Treatment Requests:");
        queue.printQueue();
    }
}

