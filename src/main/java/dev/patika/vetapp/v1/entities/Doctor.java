package dev.patika.vetapp.v1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "doctors")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id",columnDefinition = "serial")
    private Long id;

    @Column(name = "doctor_name")
    private String name;

    @Column(name = "doctor_phone",unique = true)
    private String phone;

    @Column(name = "doctor_email",unique = true)
    private String email;

    @Column(name = "doctor_address")
    private String address;

    @Column(name = "doctor_city")
    private String city;
}
