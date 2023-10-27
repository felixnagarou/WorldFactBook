package com.example.worldfactbook.entity.Government;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Entity
@RequiredArgsConstructor
@Data
@Builder

public class Party {
    @Id
    private UUID uuid;

    @ManyToOne
    private Government government;

    private String name;

    private String nameAlternative;

    private String leaders;

}
