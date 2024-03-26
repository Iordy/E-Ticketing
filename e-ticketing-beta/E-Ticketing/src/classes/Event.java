package classes;

import java.sql.Date;

public abstract class Event {

    private int id;
    private String eventName;
    private Date eventDate;
    private String eventLocation;
    private double BasicTicketPrice;
    private int numberOfTickets;
    private boolean isSoldOut;
    static int ticketsSold = 0;

    public Event() {
    }

    public Event(String eventName, Date eventDate, String eventLocation, double BasicTicketPrice, int numberOfTickets) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
        this.BasicTicketPrice = BasicTicketPrice;
        this.numberOfTickets = numberOfTickets;
        this.isSoldOut = false;
        Event.ticketsSold += 1;
    }

    public int getId() {
        return id;
    }

    public String getEventName() {
        return eventName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public double getBasicTicketPrice() {
        return BasicTicketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public boolean isSoldOut() {
        return isSoldOut;
    }

    
}
