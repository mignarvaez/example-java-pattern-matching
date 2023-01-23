package org.example;

public enum TransportType {
    AIR(1),
    SEA(2),
    GROUND(3);

    public final int value;

    private TransportType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
