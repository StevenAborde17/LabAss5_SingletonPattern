public class QueueSystem {
    private static QueueSystem instance;
    private int currentQueueNumber = 0;

    private QueueSystem() {}

    public static QueueSystem getInstance() {
        if (instance == null) {
            instance = new QueueSystem();
        }
        return instance;
    }

    public synchronized int getNextQueueNumber() {
        currentQueueNumber++;
        return currentQueueNumber;
    }

    public synchronized int getCurrentQueueNumber() {
        return currentQueueNumber;
    }

    public synchronized void resetQueue(int newQueueNumber) {
        currentQueueNumber = newQueueNumber;
        if(currentQueueNumber < 0) {
            System.out.println("Queue number cannot be negative. Resetting to 0.");
            return;
        } else {
            System.out.println("\nQueue number reset to: " + newQueueNumber);
            currentQueueNumber = newQueueNumber;
        }
    }
}