package com.example.pserver.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "person")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String gender;

    @OneToOne(cascade=CascadeType.ALL)
    // define the address_id in this entity (person table)
    @JoinColumn(name = "main_address_id", nullable = true, referencedColumnName = "id")
    private MainAddressEntity mainAddress;

    @OneToMany(cascade = CascadeType.ALL)
    //define the column in the secondary address table (the child) which will be
    // foreign key to the parent table entity (person table)
    @JoinColumn(name = "secondary_person_id", nullable = false, referencedColumnName = "id")
    private List<SecondaryAddressEntity> secondaryAddress;
}
