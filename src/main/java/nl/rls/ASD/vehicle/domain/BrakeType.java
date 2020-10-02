package nl.rls.ASD.vehicle.domain;

public enum BrakeType {
    G("G"),
    P("P"),
    X("X");

    private final String code;

    BrakeType(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }

}
