public class QueueDisplay {
    public void displayCurrentQueueNumber() {
        QueueSystem queueSystem = QueueSystem.getInstance();

        System.out.println("Current queue number: " + queueSystem.getCurrentQueueNumber());
    }
}