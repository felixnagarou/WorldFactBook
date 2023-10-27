package com.example.worldfactbook.entity.Geography;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Entity
@RequiredArgsConstructor
@Data
@Builder

public class MapReferences {
    @Id
    private UUID uuid;

    private String continentName;

    private String areaType;

    private int areaValue;

    private String units;
}
