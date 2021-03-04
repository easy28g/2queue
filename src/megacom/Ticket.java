package megacom;

public class Ticket implements Comparable<Ticket>{

    private int id;
    private int cost;
    private TicketStatus ticketStatus;

    public Ticket(int id, int cost, TicketStatus ticketStatus) {
        this.id = id;
        this.cost = cost;
        this.ticketStatus = ticketStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    @Override
    public String toString() {
        return "Ticket[" +
                "id=" + id +
                ", cost=" + cost +
                ", ticketStatus=" + ticketStatus +
                ']';
    }

    @Override
    public int compareTo(Ticket o) {

        if(this.ticketStatus.equals(o.getTicketStatus())){
            if(this.cost<o.getCost()){
                return 1;
            } else {
                return -1;
            }
        }else{
            if(this.ticketStatus.equals(ticketStatus.SIMPLE)){

                return 1;
            }else {

                return -1;
            }
        }

    }
}
