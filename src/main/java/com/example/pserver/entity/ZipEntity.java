package com.example.pserver.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "zip")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ZipEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String zip;
}
