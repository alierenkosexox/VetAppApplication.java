package dev.patika.vetapp.v1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "availables")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AvailableDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "available_id")
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "available_date")
    private LocalDate date;

}
