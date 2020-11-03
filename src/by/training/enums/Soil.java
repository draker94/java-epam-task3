package by.training.enums;

import java.util.Arrays;

public enum Soil {
    PODZOLIC("подзолистая"),
    UNPAVED("грунтовая"),
    SOD_PODZOLIC("дерново-подзолистая");

    private final String soilType;

    Soil(String soilType) {
        this.soilType = soilType;
    }

    public String getSoilType() {
        return soilType;
    }

    public static Soil getInstance(String xmlString) {
        Soil soilTarget;
        for (Soil soil : Soil.values()) {
            if (soil.soilType.equalsIgnoreCase(xmlString)) {
                soilTarget = soil;
                return soilTarget;
            }
        }
        return null;
    }
}
