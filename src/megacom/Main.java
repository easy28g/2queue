package megacom;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Ticket> first = new PriorityQueue<>();
        Queue<Ticket> second = new PriorityQueue<>();

        System.out.println("----------------First QUEUE----------------");

        for (int i = 0; i < 7; i++) {
            Ticket tiket = new Ticket(i, (int) (Math.random() * (500 - 100)) + 100, booleanRand());
            first.offer(tiket);
        }

        for(int i=0; i<7;i++){
            System.out.println(first.poll());
        }

        System.out.println("----------------Second QUEUE----------------");

        for (int i = 0; i < 7; i++) {
            Ticket tiket = new Ticket(i, (int) (Math.random() * (500 - 100)) + 100, booleanRand());
            second.offer(tiket);
        }

        for(int i=0; i<7;i++){
            System.out.println(second.poll());
        }

/*
        Ticket ticket1 = new Ticket(1, 600, TicketStatus.SIMPLE);
        Ticket ticket2 = new Ticket(2, 700, TicketStatus.VIP);
        Ticket ticket3 = new Ticket(3, 500, TicketStatus.SIMPLE);
        Ticket ticket4 = new Ticket(4, 500, TicketStatus.VIP);

        first.offer(ticket1);
        first.offer(ticket2);
        first.offer(ticket3);
        first.offer(ticket4);


        System.out.println(first.poll());
        System.out.println(first.poll());
        System.out.println(first.poll());
        System.out.println(first.poll());
*/

    }

    private static TicketStatus booleanRand() {
        int b = (int)(Math.random()*(10-1));
        if(b>5){

            return TicketStatus.VIP;
        }
        else {

            return TicketStatus.SIMPLE;
        }
    }
}
