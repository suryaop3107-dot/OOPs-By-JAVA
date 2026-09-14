class TicketCounter implements Runnable {

    static int availableTickets = 3;

    synchronized void bookTicket() {
        if (availableTickets > 0) {
            System.out.println("Ticket booked");
            availableTickets--;
        } else {
            System.out.println("No tickets");
        }
    }

    public void run() {
        bookTicket();
    }
}

public class TicketTest {
    public static void main(String[] args) {

        TicketCounter c = new TicketCounter();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);

        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}