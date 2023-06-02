package Test;

import Entity.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    private TravelPackage vizag;
    private Destination beach;
    private Activity swimming;
    private Activity playing;
    private Activity cooking;
    Passenger tomHanks;
    Passenger robertDowneyJr;
    Passenger leonardoDiCaprio;

    @BeforeEach
    public void setup(){
        vizag = new TravelPackage("vizag",10);
        beach  = new Destination("Beach");
        swimming = new Activity("Swimming", "Enjoy swimming in a pool", 10.0, 50);
        playing = new Activity("Playing", "Engage in outdoor games", 20.0, 30);
        cooking = new Activity("Cooking", "Learn to cook delicious meals", 25.0, 20);
        vizag.addDestination(beach);
        beach.addActivity(swimming);
        tomHanks = new Passenger("Tom Hanks", "P001", MembershipType.GOLD, 100.0);
        robertDowneyJr = new Passenger("Robert Downey Jr", "P002", MembershipType.PREMIUM, 1000.0);
        leonardoDiCaprio  = new Passenger("Leonardo DiCaprio", "P003", MembershipType.STANDARD, 750.0);
        vizag.addPassenger(tomHanks);
        vizag.addPassenger(robertDowneyJr);

    }


    @Test
    void chooseDestination() {
        tomHanks.chooseDestination(beach);
        assertEquals(tomHanks.getDestinations(), List.of(beach));
    }

    @Test
    void enrollActivities() {
        tomHanks.chooseDestination(beach);
        tomHanks.enrollActivities(swimming);
        assertEquals(tomHanks.getActivityList(),List.of(swimming));
        assertEquals(91,tomHanks.getBalance());
    }
}