package Entity;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private String passengerNumber;
    private MembershipType membership;
    private double balance;

    private List<Destination> destinations;

    public List<Destination> getDestinations() {
        return destinations;
    }

    private List<Activity> activityList;



    private TravelPackage travelPackage;


    public Passenger(String name, String passengerNumber, MembershipType membership, double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.membership = membership;
        this.balance = balance;
        activityList = new ArrayList<>();
        destinations = new ArrayList<>();
    }

    public Passenger() {
        activityList = new ArrayList<>();
        destinations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(String passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public MembershipType getMembership() {
        return membership;
    }

    public void setMembership(MembershipType membership) {
        this.membership = membership;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public TravelPackage getTravelPackage() {
        return travelPackage;
    }
    public List<Activity> getActivityList() {
        return activityList;
    }

    public void setTravelPackage(TravelPackage travelPackage) {
        if(this.travelPackage==null){
            this.travelPackage = travelPackage;
        }
        else{
            System.out.println("You have already choose a package");
        }

    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", passengerNumber='" + passengerNumber + '\'' +
                ", membership='" + membership + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void passengerDetails(){
        System.out.println("Passenger Name: "+this.getName());
        System.out.println("Passenger Number: "+this.getPassengerNumber());
        if(getMembership().equals(MembershipType.PREMIUM)){
            System.out.println("Unlimited Balance for Premium Members");
        }
        else{
            System.out.println("Balance: "+this.getBalance());
        }

    }

//    public void choosePackage(TravelPackage travelPackage){
//        this.travelPackage = travelPackage;
//    }
//
    public void chooseDestination(Destination destination){

       if(this.travelPackage.getDestinations().contains(destination)){
           destinations.add(destination);
       }
       else{
           System.out.println("This Destination is not a part of this Travel Package");
       }
    }

    public void enrollActivities(Activity activity){
       if(this.destinations.contains(activity.getDestination())){
//        System.out.println("Activities available at this Destination: "+activity.getDestination());
//        activity.getDestination().getActivityList().forEach(e->{
//            System.out.println(e);
//        });
        if(activity.getDestination().getActivityList().contains(activity)) {
            if (!this.activityList.contains(activity)) {
                if (activity.getCurrentCapacity() > 0) {
                    if (this.getMembership() == MembershipType.PREMIUM) {
                        this.activityList.add(activity);
                        activity.register();
                        System.out.println("You are successfully enrolled");
                    } else {
                        if (this.getMembership()==MembershipType.GOLD?this.balance >= activity.getCost()*(10/100):this.balance >= activity.getCost()) {
                            if (this.getMembership() == MembershipType.GOLD) {
                                this.balance -= activity.getCost() - (activity.getCost()/10);
                            }
                            else this.balance -= activity.getCost();
                            this.activityList.add(activity);
                            activity.register();
                            System.out.println("You are successfully enrolled");
                        } else {
                            System.out.println("You don't have enough balance");
                        }
                    }
                } else {
                    System.out.println("You cannot enroll as the activity is at Full Capacity");
                }
            }
            else{
                System.out.println("You have already registered for this activity");
            }
        }
        else{
            System.out.println("You cannot enroll as the activity is not under current Destination");
        }
        }
       else {
           System.out.println("You have not opted for the destination in which this activity exists");
       }


    }






}
