package com.example.studybooking.model;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private  String password;

    @Column(nullable = false)
    private  String role = "USER";

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;


}
