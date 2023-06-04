package Entity;


import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> destinations;
    private List<Passenger> passengers;

    private int currentCapacity;

    public TravelPackage(String name, int passengerCapacity, List<Destination> destinations,
                         List<Passenger> passengers) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.destinations = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public TravelPackage(String name, int passengerCapacity, List<Destination> destinations){
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.destinations = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public TravelPackage(String name, int passengerCapacity){
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.destinations = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public TravelPackage() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }


    @Override
    public String toString() {
        return "TravelPackage{" +
                "name='" + name + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", destinations=" + destinations +
                ", passengers=" + passengers +
                '}';
    }

    public void printItinerary(){
        System.out.println("Travel Package: "+this.name);
        System.out.println("Destinations: ");
        this.destinations.forEach(e->{
            System.out.println("Destination: "+e.getName());
            System.out.println("Activities Available");
            e.getActivityList().forEach(e1->{
                System.out.println("Activity Name: "+e1.getName());
                System.out.println("Activity Description: "+e1.getDescription());
                System.out.println("Activity Cost: "+e1.getCost());
                System.out.println("Activity Capacity: "+e1.getCapacity());
            });
            System.out.println("*****************************************");
        });
    }

    public void printPassengerList(){
        System.out.println("Package name: "+this.getName());
        System.out.println("Total Passengers Capacity: "+this.getPassengerCapacity());
        if(this.getPassengers().size()>0) {
            System.out.println("Passengers Currently Enrolled: " + this.getPassengers().size());
            System.out.println("Passenger List");
            passengers.forEach(e -> {
                System.out.println("name of Passenger: " + e.getName());
                System.out.println("Number of Passenger: " + e.getPassengerNumber());
            });
        }
        else {
            System.out.println("No Passenger Registered till Now");
        }
    }

    public void addDestination(Destination destination){
        destinations.add(destination);
    }
    public void addPassenger(Passenger passenger){
        if(this.currentCapacity<this.passengerCapacity){
            passengers.add(passenger);
            if(passenger.getTravelPackage()==null) passenger.setTravelPackage(this);
            currentCapacity++;
            System.out.println("Passenger Added Successfully");
        }
        else{
            System.out.println("The Capacity is Full");
        }
    }


}
