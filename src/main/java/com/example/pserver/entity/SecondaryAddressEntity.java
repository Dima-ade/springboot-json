package com.example.pserver.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "secondary_address")
@Getter
@Setter
public class SecondaryAddressEntity extends MainAddressEntity {
}
