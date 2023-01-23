package org.example;

public record RoyalCaribbean(TransportType type, int discount) implements Company {
    @Override
    public String getId() {
        return "3";
    }

    @Override
    public String getName() {
        return "Royal Caribbean";
    }

    @Override
    public int getType() {
        return 0;
    }

    @Override
    public int getDiscount() {
        return discount;
    }
}
