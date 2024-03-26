package com.andrei.eticketing.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "regular_users")
public final class RegularUser extends User {

    private double likelinessToSubscribe;

}
