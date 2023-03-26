package camera;

import java.util.ArrayList;

public class UnpaidTicketHandler extends Handler{

    private ArrayList<String> tickets = new ArrayList<>();

    public UnpaidTicketHandler(Handler nextHandler) {
        super(nextHandler);
    }

    public void setTickets(ArrayList<String> tickets) {
        this.tickets = tickets;
    }

    private boolean hasTicket(String plate){
        for(String ticket : tickets){
            if (ticket.equals(plate)){
                return true;
            }
        }
        return false;
    }
    @Override
    public void handleRecord(Record record) {
        if (hasTicket(record.getPlate())){
            System.out.println("record with unpaid tickets detected");
        }

    }
}
