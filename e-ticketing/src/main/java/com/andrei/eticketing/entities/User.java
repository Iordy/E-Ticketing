
package com.andrei.eticketing.entities;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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



}


