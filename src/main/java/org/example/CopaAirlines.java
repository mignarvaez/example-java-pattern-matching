package org.example;

public record CopaAirlines(TransportType transportType, boolean partner) implements Company {

    @Override
    public String getId() {
        return "2";
    }

    @Override
    public String getName() {
        return "Copa Airlines";
    }

    @Override
    public int getType() {
        return transportType.getValue();
    }

    @Override
    public int getDiscount() {
        return 10;
    }
}
