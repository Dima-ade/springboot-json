package com.example.pserver.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "building")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BuildingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToOne(cascade=CascadeType.ALL)
    // define the address_id in this entity (building table)
    @JoinColumn(name = "address_id", nullable = true, referencedColumnName = "id")
    private MainAddressEntity mainAddress;
}
