package by.training.enums;

public enum  Multiplying {
    LEAVES("листьями"),
    CUTTINGS("черенками"),
    SEEDS("семенами");

    private final String multiplyingType;

    Multiplying(String multiplyingType) {
        this.multiplyingType = multiplyingType;
    }

    public String getMultiplyingType() {
        return multiplyingType;
    }

    public static Multiplying getInstance(String xmlString) {
        Multiplying multiplyingTarget;
        for (Multiplying multiplying : Multiplying.values()) {
            if (multiplying.multiplyingType.equalsIgnoreCase(xmlString)) {
                multiplyingTarget = multiplying;
                return multiplyingTarget;
            }
        }
        return null;
    }
}
