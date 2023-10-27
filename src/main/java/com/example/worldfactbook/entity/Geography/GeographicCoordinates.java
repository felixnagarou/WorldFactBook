package com.example.worldfactbook.entity.Geography;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Entity
@RequiredArgsConstructor

@Data

public class GeographicCoordinates {
    @Id
    private UUID uuid;

    @OneToOne
    private GeographyData geographyData;

    private String name;

    private int degrees;

    private int minutes;

    private char hemisphere;
}
