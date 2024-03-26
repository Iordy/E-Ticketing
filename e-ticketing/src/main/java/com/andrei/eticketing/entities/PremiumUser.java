package com.andrei.eticketing.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "premium_users")
public final class PremiumUser extends User {

    private double subscriptionFee;
    private String subscribedSince;
    // constructors, getters, and setters...
}
