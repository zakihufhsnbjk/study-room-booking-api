package com.example.studybooking.model;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "study_rooms")
public class StudyRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int capacity;

    @OneToMany(mappedBy = "studyRoom")
    private List<Booking> bookings;
}
