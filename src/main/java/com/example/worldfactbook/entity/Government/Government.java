package com.example.worldfactbook.entity.Government;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@Builder
@RequiredArgsConstructor
@Data
@Entity
public class Government {

    @Id
    private UUID uuid;

    private String governmentType;

    private String nationalHolidays;

    private String constitution;

    private String independence;

    private String legalSystem;

    private String suffrage;

    @OneToMany
    private List<Party> politicalParties;

}
