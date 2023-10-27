package com.example.worldfactbook.entity;

import com.example.worldfactbook.entity.Geography.GeographyData;
import com.example.worldfactbook.entity.Government.Government;
import com.example.worldfactbook.entity.Population.People;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
@Entity
@Data
@Builder
public class CountryEntity {

    @Id

    private UUID uuid;

    private String name;

    private  String background;

    @OneToOne
    private GeographyData geography;

    @OneToOne
    private People people;

    @OneToOne
    private Government government;

    @OneToOne
    private Economy economy;

    @OneToOne
    private Energy energy;

    @OneToOne
    @JoinColumn
    private Communications communications;

    @OneToOne
    private Transportation transportation;

    @OneToOne
    private MilitaryAndSecurity militaryAndSecurity;

    @OneToOne
    private TransnationalIssues transnationalIssues;

}
