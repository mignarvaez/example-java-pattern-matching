package org.example;

public record Avianca(TransportType transportType) implements Company {

    @Override
    public String getId() {
        return "1";
    }

    @Override
    public String getName() {
        return "Avianca";
    }

    @Override
    public int getType() {
        return transportType.getValue();
    }
}
