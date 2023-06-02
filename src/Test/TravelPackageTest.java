package Test;


import Entity.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TravelPackageTest {
    private TravelPackage vizag;
    private Destination beach;
    private Activity swimming;
    Passenger tomHanks;
    Passenger robertDowneyJr;
    Passenger leonardoDiCaprio;

    @BeforeEach
    public void setup(){
        vizag = new TravelPackage("vizag",10);
        beach  = new Destination("Beach");
        swimming = new Activity("Swimming", "Enjoy swimming in a pool", 10.0, 50);
        vizag.addDestination(beach);
        beach.addActivity(swimming);
        tomHanks = new Passenger("Tom Hanks", "P001", MembershipType.GOLD, 100.0);
        robertDowneyJr = new Passenger("Robert Downey Jr", "P002", MembershipType.PREMIUM, 1000.0);
        leonardoDiCaprio  = new Passenger("Leonardo DiCaprio", "P003", MembershipType.STANDARD, 750.0);
        vizag.addPassenger(tomHanks);
        vizag.addPassenger(robertDowneyJr);

    }

    @Test
    void printItinerary() {
        vizag.printItinerary();

    }

    @Test
    void printPassengerList() {
        vizag.printPassengerList();

    }

    @Test
    void addDestination() {
        assertEquals(vizag.getDestinations(), List.of(beach));
    }

    @Test
    void addPassenger() {
        assertEquals(vizag.getPassengers(), List.of(tomHanks,robertDowneyJr));
    }
}