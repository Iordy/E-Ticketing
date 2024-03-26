package classes;

public abstract class Ticket {

    protected int id;
    protected double price;
    protected int eventId;
    protected int userId;
    protected boolean isPaid;
    protected int numberOfBenefits;

    public Ticket() {
    }

    public Ticket(double price, int eventId, int userId, boolean isPaid) {
        this.price = price;
        this.eventId = eventId;
        this.userId = userId;
        this.isPaid = isPaid;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getEventId() {
        return eventId;
    }

    public int getUserId() {
        return userId;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void PayTicket()
    {
        this.isPaid = true;
    }

    public void ChangeBearer(User newUser)
    {
        this.userId = newUser.getId();
    }

    public abstract double getTicketPrice();

    
}
