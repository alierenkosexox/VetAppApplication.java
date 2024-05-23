package dev.patika.vetapp.v1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;

@Entity
@Table(name = "animals")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animal_id",columnDefinition = "serial")
    private Long id;

    @Column(name = "animal_name")
    private String name;

    @Column(name = "animal_species")
    private String species;

    @Column(name = "animal_breed")
    private String breed;

    @Column(name = "animal_gender")
    private String gender;

    @Column(name = "animal_colour")
    private String colour;

    @Column(name = "animal_birth_date")
    @Temporal(TemporalType.DATE)
    private LocalDate dateOfBirth;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "animal_customer_id",referencedColumnName = "customer_id")
    private Customer customer;

}
