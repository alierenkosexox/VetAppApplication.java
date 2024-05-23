package dev.patika.vetapp.v1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id",columnDefinition = "serial")
    private Long id;

    @Column(name = "customer_name")
    private String name;

    @Column(name = "customer_phone",unique = true)
    private String phone;

    @Column(name = "customer_email",unique = true)
    private String email;

    @Column(name = "customer_address")
    private String address;

    @Column(name = "customer_city")
    private String city;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.REMOVE)
    @JsonIgnore
    private List<Animal> animals;

}
