package com.example.worldfactbook.models;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class CountryDTO {
    private String name;

    private String background;

    private String location;




}
