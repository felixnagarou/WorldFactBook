package com.example.worldfactbook.entity.Population;

import com.example.worldfactbook.entity.Population.People;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Entity
@RequiredArgsConstructor
@Builder
@Data
public class EthnicGroups {

    @Id
    private UUID id;

    @ManyToOne
    private People people;

    private String ethnicGroupName;

}
