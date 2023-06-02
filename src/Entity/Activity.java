package Entity;

public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;

    private Destination destination;

    private int currentCapacity;

    public Activity(String name, String description, double cost, int capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.currentCapacity = capacity;
    }

    public Activity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public double getCost() {
        return cost;
    }

    public Destination getDestination() {
        return destination;
    }


    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                ", capacity=" + capacity +
                '}';
    }

    public void register(){
        System.out.println("Successfully registered");
        this.currentCapacity--;
    }
}
