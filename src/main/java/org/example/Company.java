package org.example;

public sealed interface Company permits Avianca, CopaAirlines, RoyalCaribbean {
    String getId();

    String getName();

    int getType();

    default int getDiscount() {
        return 0;
    }

}

