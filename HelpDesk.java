public class HelpDesk {
    private String helpDeskName;

    public HelpDesk(String helpDeskName) {
        this.helpDeskName = helpDeskName;
    }

    public void serveNextVisitor() {
        QueueSystem queueSystem = QueueSystem.getInstance();
        int nextQueueNumber = queueSystem.getNextQueueNumber();
        System.out.println(helpDeskName + " is now serving queue number " + nextQueueNumber);
    }

    public void resetQueue(int newQueueNumber) {
        QueueSystem queueSystem = QueueSystem.getInstance();
        queueSystem.resetQueue(newQueueNumber);
    }
}