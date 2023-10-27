package com.example.worldfactbook.entity.Population;

import com.example.worldfactbook.entity.CountryEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Builder
@RequiredArgsConstructor
public class People {
    @Id
    private UUID uuid;

    @OneToOne
    private CountryEntity country;

    @OneToMany
    private List<EthnicGroups> ethnicGroups;

    @ManyToMany
    private List<Languages> languages;
}
