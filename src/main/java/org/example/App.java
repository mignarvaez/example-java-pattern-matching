package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        double total = 5000;
        Avianca avianca = new Avianca(TransportType.AIR);
        CopaAirlines copaAirlines = new CopaAirlines(TransportType.AIR, true);
        RoyalCaribbean royalCaribbean = new RoyalCaribbean(TransportType.SEA, 50);

        System.out.println("The total ammount for " + avianca.getName() + " is " + getTotal(total, avianca));
        System.out.println("The total ammount for " + copaAirlines.getName() + " is " + getTotal(total, copaAirlines));
        System.out.println("The total ammount for " + royalCaribbean.getName() + " is " + getTotal(total, royalCaribbean));

    }

    private static double getTotal(double total, Company company) {
        return switch (company) {
            case null -> 0.0;
            case Avianca ignored -> total;
            case CopaAirlines copaAirlines when copaAirlines.partner() && copaAirlines.getDiscount() < 15 ->
                    total * (1 - ((copaAirlines.getDiscount() + 10d) / 100));
            case CopaAirlines copaAirlines -> total * (1 - copaAirlines.getDiscount() / 100d);
            case RoyalCaribbean royalCaribbean -> total * (1 - royalCaribbean.discount() / 100d);

        };
    }
}
