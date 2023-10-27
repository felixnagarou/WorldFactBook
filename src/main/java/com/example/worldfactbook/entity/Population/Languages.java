package com.example.worldfactbook.entity.Population;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;

import java.util.UUID;

@Entity
@Builder
public class Languages {
    @Id
    private UUID uuid;

    private String languageName;

}
