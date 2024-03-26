

package classes;

public abstract class User{

    protected int id;
    protected String name;
    protected String email;
    protected String hashedPassword;
    protected String age;
    protected String phoneNumber;
    

    public User() {
    }

    public User(String name, String email, String hashedPassword, String age, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.hashedPassword = hashedPassword;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public String getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public abstract double getTicketDiscount();



}

