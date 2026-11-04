public class QueueApp {
    public static void main(String[] args) {
        QueueDisplay queueDisplay = new QueueDisplay();
        HelpDesk helpDesk1 = new HelpDesk("Help Desk 1");
        HelpDesk helpDesk2 = new HelpDesk("Help Desk 2");
        HelpDesk helpDesk3 = new HelpDesk("Help Desk 3");

        System.out.println("=== Pag-ibig Queue System ===");
        queueDisplay.displayCurrentQueueNumber();

        helpDesk1.serveNextVisitor();
        helpDesk2.serveNextVisitor();
        helpDesk3.serveNextVisitor();

        queueDisplay.displayCurrentQueueNumber();

        //reset queue number to 0
        helpDesk1.resetQueue(0);
        queueDisplay.displayCurrentQueueNumber();

        helpDesk3.serveNextVisitor();
        queueDisplay.displayCurrentQueueNumber();
    }
}
