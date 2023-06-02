package Entity;

import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;
    private List<Activity> activityList;

    public Destination(String name, List<Activity> activityList) {
        this.name = name;
        this.activityList = new ArrayList<>();
    }
    public Destination(String name) {
        this.name = name;
        this.activityList = new ArrayList<>();
    }


    public Destination() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "name='" + name + '\'' +
                ", activityList=" + activityList +
                '}';
    }


    public void addActivity(Activity activity){
        if(activity.getDestination() == null || activity.getDestination().equals(this)){
            if(activity.getDestination() ==null) activity.setDestination(this);
            activityList.add(activity);
        }
        else{
            System.out.println("Current Activity "+activity.getName()+" is already added and  does not belong to "+this.getName()+" destination");
        }
    }

    public void addActivity(List<Activity> activities){
        for (Activity activity : activities) {
            if(activity.getDestination() == null || activity.getDestination().equals(this)){
                if(activity.getDestination() ==null) activity.setDestination(this);
                activityList.add(activity);
            }
            else{
                System.out.println("Current Activity "+activity.getName()+" is already added and  does not belong to "+this.getName()+" destination");
            }
        }

    }

}
