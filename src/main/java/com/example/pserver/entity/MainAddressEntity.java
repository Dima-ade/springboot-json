package com.example.pserver.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "main_address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public class MainAddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String street;

    @Column
    private String city;

    @Column
    private String state;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private ZipEntity zip;
}
