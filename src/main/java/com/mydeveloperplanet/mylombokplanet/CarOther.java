package com.mydeveloperplanet.mylombokplanet;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(exclude = {"engineType", "hybrid"})
public class CarOther {
    @Getter private String brand;
    @Setter private String numberOfWheels;
    private String engineType;
    private boolean hybrid;
}
