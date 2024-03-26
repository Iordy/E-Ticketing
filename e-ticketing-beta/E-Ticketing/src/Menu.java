
import classes.*;
import java.util.ArrayList;
import java.util.Map;


public final class Menu {


    private static ArrayList<User> users = new ArrayList<User>();
    private static ArrayList <Ticket> tickets = new ArrayList<Ticket>();
    private static ArrayList <Event> events = new ArrayList<Event>();

    private static ArrayList<Map.Entry<User, Ticket>> atendeeCorrespondence = new ArrayList<>();
    private static ArrayList<Map.Entry<Event, Ticket>> eventCorrespondence = new ArrayList<>();


    private static Menu instance = null;

    private Menu() {
    }

    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }

    public void printMenu() {

        System.out.println("1. Register a user");
        System.out.println("2. Create an event");
        System.out.println("3. Create a ticket");
        System.out.println("3. Exit");

        String option  = "";

        System.out.println("Select an option: ");
        option = System.console().readLine();

        if (option.equals("1"))
        {
            System.out.println("Enter your name: ");
            String name = System.console().readLine();
            System.out.println("Enter your email: ");
            String email = System.console().readLine();
            System.out.println("Enter your password: ");
            String password = System.console().readLine();
            System.out.println("Enter your age: ");
            String age = System.console().readLine();
            System.out.println("Enter your phone number: ");
            String phoneNumber = System.console().readLine();
            System.out.println("Are you a premium user? (yes/no): ");
            String isPremium = System.console().readLine();
            if (isPremium.equals("yes"))
            {
                double fee = 100;
                String subscribedSince = "2024-04-4";
                PremiumUser user = new PremiumUser(name, email, password, age, phoneNumber, fee, java.sql.Date.valueOf(subscribedSince));
                users.add(user);
            }
            else
            {
                RegularUser user = new RegularUser(name, email, password, age, phoneNumber, 0);
                users.add(user);
            }
        }
    

  
}
    
}
