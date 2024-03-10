import java.util.Random;

public class TicketGenerator {
    private Random ticket;

    // Constructor
    public TicketGenerator() {
        this.ticket = new Random();
    }

    private int randomGenerator() {
        return ticket.nextInt(9000) + 1000;
    }

    public int getTicket() {
        int generatedTicket = randomGenerator();
        return generatedTicket;
    }

    public void display() {
        System.out.println(getTicket());
    }
}
