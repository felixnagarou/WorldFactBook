package com.example.worldfactbook.entity.Geography;

import com.example.worldfactbook.entity.CountryEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Entity
@RequiredArgsConstructor
@Data
@Builder

public class GeographyData {

    @Id
    private UUID uuid;

    @OneToOne
    @JoinColumn
    private CountryEntity countryEntity;

    private String location;

    @OneToOne
    private GeographicCoordinates coordinates;


    private MapReferences mapReferences;
}
