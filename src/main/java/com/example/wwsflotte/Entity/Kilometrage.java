package com.example.wwsflotte.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Kilometrage {
    @Id
    @SequenceGenerator(
        name = "kilometrage_sequence",
        sequenceName = "kilometrage_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "kilometrage_sequence"
    )
    Long idkilometrage;
    Long idvehicule;
    java.util.Date date;
    Double debut;
    Double fin;
}
