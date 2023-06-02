package Entity;

import java.security.interfaces.DSAKey;
import java.util.List;

public class Main {

    //Passengers
    Passenger tomHanks = new Passenger("Tom Hanks", "P001", MembershipType.GOLD, 100.0);
    Passenger robertDowneyJr = new Passenger("Robert Downey Jr", "P002", MembershipType.PREMIUM, 1000.0);
    Passenger leonardoDiCaprio = new Passenger("Leonardo DiCaprio", "P003", MembershipType.STANDARD, 750.0);
    Passenger bradPitt = new Passenger("Brad Pitt", "P004", MembershipType.STANDARD, 250.0);
    Passenger johnnyDepp = new Passenger("Johnny Depp", "P005", MembershipType.GOLD, 800.0);
    Passenger mattDamon = new Passenger("Matt Damon", "P006", MembershipType.PREMIUM, 1200.0);
    Passenger denzelWashington = new Passenger("Denzel Washington", "P007", MembershipType.STANDARD, 300.0);
    Passenger morganFreeman = new Passenger("Morgan Freeman", "P008", MembershipType.GOLD, 900.0);
    Passenger bruceWillis = new Passenger("Bruce Willis", "P009", MembershipType.PREMIUM, 1100.0);
    Passenger harrisonFord = new Passenger("Harrison Ford", "P010", MembershipType.GOLD, 700.0);

    //TravelPackage
    TravelPackage vizag = new TravelPackage("Vizag",5);
    TravelPackage hyderabad = new TravelPackage("Hyderabad",5);

    //Destinations
    Destination beach = new Destination("Beach");
    Destination mountain = new Destination("Mountain");
    Destination city = new Destination("City");
    Destination desert = new Destination("Desert");
    Destination island = new Destination("Island");
    Destination jungle = new Destination("Jungle");
    Destination lake = new Destination("Lake");
    Destination waterfall = new Destination("Waterfall");
    Destination countryside = new Destination("Countryside");
    Destination historicalSite = new Destination("Historical Site");
    Destination nationalPark = new Destination("National Park");
    Destination themePark = new Destination("Theme Park");
    Destination spaRetreat = new Destination("Spa Retreat");
    Destination skiResort = new Destination("Ski Resort");
    Destination adventurePark = new Destination("Adventure Park");

    //Activities
    Activity swimming = new Activity("Swimming", "Enjoy swimming in a pool", 10.0, 50);
    Activity playing = new Activity("Playing", "Engage in outdoor games", 20.0, 30);
    Activity hiking = new Activity("Hiking", "Go on a hiking adventure", 15.0, 40);
    Activity cooking = new Activity("Cooking", "Learn to cook delicious meals", 25.0, 20);
    Activity dancing = new Activity("Dancing", "Join a dance class", 30.0, 50);
    Activity painting = new Activity("Painting", "Express yourself through art", 35.0, 40);
    Activity yoga = new Activity("Yoga", "Practice yoga for mindfulness", 20.0, 30);
    Activity cycling = new Activity("Cycling", "Enjoy cycling in scenic routes", 25.0, 40);
    Activity photography = new Activity("Photography", "Capture moments through photography", 30.0, 20);
    Activity snorkeling = new Activity("Snorkeling", "Explore underwater beauty", 45.0, 50);
    Activity meditation = new Activity("Meditation", "Find inner peace through meditation", 15.0, 30);
    Activity running = new Activity("Running", "Stay fit through running", 20.0, 40);
    Activity reading = new Activity("Reading", "Dive into the world of books", 25.0, 30);
    Activity gardening = new Activity("Gardening", "Create a beautiful garden", 30.0, 20);
    Activity movieNight = new Activity("Movie Night", "Enjoy a movie night with friends", 20.0, 30);
    Activity fishing = new Activity("Fishing", "Go fishing in a serene lake", 25.0, 40);
    Activity stargazing = new Activity("Stargazing", "Observe the wonders of the night sky", 30.0, 20);
    Activity karaoke = new Activity("Karaoke", "Sing your heart out with karaoke", 45.0, 50);
    Activity camping = new Activity("Camping", "Experience the joy of camping", 15.0, 30);
    Activity paintingWorkshop = new Activity("Painting Workshop", "Join a painting workshop", 20.0, 40);
    Activity tennis = new Activity("Tennis", "Play tennis with friends", 25.0, 30);
    Activity birdWatching = new Activity("Bird Watching", "Spot beautiful birds in nature", 30.0, 20);
    Activity wineTasting = new Activity("Wine Tasting", "Indulge in wine tasting", 20.0, 30);
    Activity horseRiding = new Activity("Horse Riding", "Enjoy horseback riding", 25.0, 40);
    Activity beachVolleyball = new Activity("Beach Volleyball", "Play volleyball on the beach", 30.0, 20);
    Activity iceSkating = new Activity("Ice Skating", "Glide on ice with ice skating", 45.0, 50);
    Activity kayaking = new Activity("Kayaking", "Go kayaking in scenic waters", 15.0, 30);
    Activity boardGames = new Activity("Board Games", "Have fun with board games", 20.0, 40);
    Activity archery = new Activity("Archery", "Learn archery skills", 25.0, 30);
    Activity wineTastingTour = new Activity("Wine Tasting Tour", "Take a tour of vineyards", 30.0, 20);
    Activity badminton = new Activity("Badminton", "Play badminton with friends", 20.0, 30);
    Activity photographyWorkshop = new Activity("Photography Workshop", "Join a photography workshop", 25.0, 40);
    Activity cookingClass = new Activity("Cooking Class", "Learn to cook gourmet dishes", 30.0, 20);
    Activity spaDay = new Activity("Spa Day", "Indulge in a relaxing spa day", 45.0, 50);
    Activity hikingExcursion = new Activity("Hiking Excursion", "Go on an adventurous hiking trip", 15.0, 30);
    Activity yogaRetreat = new Activity("Yoga Retreat", "Join a yoga retreat for rejuvenation", 20.0, 40);
    Activity potteryClass = new Activity("Pottery Class", "Create pottery masterpieces", 25.0, 30);
    Activity wineTastingEvent = new Activity("Wine Tasting Event", "Attend a wine tasting event", 30.0, 20);
    Activity cyclingTour = new Activity("Cycling Tour", "Take a guided cycling tour", 20.0, 30);
    Activity paintingWorkshop2 = new Activity("Painting Workshop 2", "Enhance your painting skills", 25.0, 40);
    Activity danceClass = new Activity("Dance Class", "Learn various dance styles", 30.0, 20);
    Activity cookingWorkshop = new Activity("Cooking Workshop", "Attend a cooking workshop", 45.0, 50);

    public  void addDestinations(){
        vizag.addDestination(beach);
        vizag.addDestination(mountain);
        vizag.addDestination(city);
        vizag.addDestination(desert);
        vizag.addDestination(island);
        vizag.addDestination(jungle);
        vizag.addDestination(lake);
        vizag.addDestination(nationalPark);

        hyderabad.addDestination(waterfall);
        hyderabad.addDestination(countryside);
        hyderabad.addDestination(historicalSite);
        hyderabad.addDestination(nationalPark);
        hyderabad.addDestination(themePark);
        hyderabad.addDestination(spaRetreat);
        hyderabad.addDestination(skiResort);
        hyderabad.addDestination(adventurePark);

    }

    public void addActivities(){
        beach.addActivity(swimming);
        beach.addActivity(cooking);
        beach.addActivity(dancing);
        beach.addActivity(painting);
        beach.addActivity(yoga);
        mountain.addActivity(hiking);
        mountain.addActivity(playing);
        mountain.addActivity(cycling);
        mountain.addActivity(photography);
        mountain.addActivity(snorkeling);
        city.addActivity(meditation);
        city.addActivity(running);
        city.addActivity(reading);
        desert.addActivity(gardening);
        desert.addActivity(movieNight);
        desert.addActivity(fishing);
        desert.addActivity(stargazing);
        island.addActivity(List.of(karaoke,camping,paintingWorkshop));
        jungle.addActivity(List.of(tennis,birdWatching,wineTasting));
        lake.addActivity(List.of(horseRiding,beachVolleyball,iceSkating));
        waterfall.addActivity(List.of(kayaking,boardGames,archery));
        countryside.addActivity(List.of(wineTastingTour,badminton,photographyWorkshop));
        historicalSite.addActivity(List.of(cookingClass,spaDay,hikingExcursion));
        nationalPark.addActivity(List.of(yogaRetreat,danceClass));
        themePark.addActivity(List.of(potteryClass));
        spaRetreat.addActivity(List.of(wineTastingEvent));
        skiResort.addActivity(List.of(cyclingTour));
        adventurePark.addActivity(List.of(paintingWorkshop2,cookingWorkshop));


    }

    public void addPassengers(){
        vizag.addPassenger(tomHanks);
        vizag.addPassenger(robertDowneyJr);
        vizag.addPassenger(leonardoDiCaprio);
        vizag.addPassenger(bradPitt);
        vizag.addPassenger(johnnyDepp);
        hyderabad.addPassenger(mattDamon);
        hyderabad.addPassenger(denzelWashington);
        hyderabad.addPassenger(morganFreeman);
        hyderabad.addPassenger(bruceWillis);
        hyderabad.addPassenger(harrisonFord);


    }


    public static void main(String[] args) {
        Main m = new Main();
        m.addDestinations();
        m.addActivities();
        m.addPassengers();
      //  m.vizag.printItinerary();
       // System.out.println(m.vizag.getPassengers());
      //  m.hyderabad.printItinerary();
     //   System.out.println(m.hyderabad.getPassengers());
          m.tomHanks.enrollActivities(m.cycling);
          m.tomHanks.enrollActivities(m.paintingWorkshop2);
          System.out.println( m.tomHanks.getBalance());
          System.out.println(m.tomHanks.getTravelPackage());
          m.tomHanks.chooseDestination(m.mountain);
          m.tomHanks.enrollActivities(m.cycling);
          System.out.println( m.tomHanks.getBalance());
          m.tomHanks.enrollActivities(m.paintingWorkshop2);
          m.tomHanks.enrollActivities(m.swimming);
          m.tomHanks.chooseDestination(m.waterfall);
          m.tomHanks.setTravelPackage(m.hyderabad);
          m.tomHanks.enrollActivities(m.hiking);
          m.tomHanks.enrollActivities(m.playing);
          m.tomHanks.enrollActivities(m.cycling);
          m.tomHanks.enrollActivities(m.cycling);
          System.out.println(m.tomHanks.getBalance());
          m.leonardoDiCaprio.chooseDestination(m.beach);
          m.leonardoDiCaprio.enrollActivities(m.swimming);
          m.leonardoDiCaprio.enrollActivities(m.cooking);
          m.leonardoDiCaprio.enrollActivities(m.dancing);
          System.out.println(m.leonardoDiCaprio.getBalance());






































//       Passenger vasanth= new Passenger("Vasanth","123",MembershipType.STANDARD,200);
//       Passenger Kumar = new Passenger("Kumar","134",MembershipType.GOLD,300);
//       Passenger Vasi = new Passenger("Vasi","144",MembershipType.PREMIUM,400);
//
//        Destination RK_Beach = new Destination("RK Beach");
//        Destination Kailshgiri = new Destination("Kaiasagiri");
//        Destination Aquarium  = new Destination("Aquarium");
//        Destination FilmCity = new Destination("FilmCity");
//        Destination Arakuvalley = new Destination("ArakuValley");
//
//
//
//
//
//
//     //   Activity swimming = new Activity("Swimming","Swim like a fish",100,5);
//        Activity Fishing = new Activity("Fishing","Do fishing",100,5);
//        Activity Sighting = new Activity("Sighting","do sighting",100,5);
//        Activity Acting = new Activity("Acting","Do Acting",100,5);
//
//
//        Kailshgiri.addActivity(Sighting);
//        Aquarium.addActivity(Fishing);
//        FilmCity.addActivity(Acting);
//
//        TravelPackage Vizag = new TravelPackage("Vizag",10);
//        Vizag.addDestination(RK_Beach);
//        Vizag.addDestination(Kailshgiri);
//        Vizag.addDestination(Aquarium);
//        Vizag.addDestination(FilmCity);
//
//        vasanth.choosePackage(Vizag);
//        Vizag.getDestinations();
//        vasanth.chooseDestination(RK_Beach);
//        vasanth.chooseDestination(Kailshgiri);
//        vasanth.chooseDestination(Aquarium);
//        vasanth.chooseDestination(FilmCity);
//        vasanth.chooseDestination(Arakuvalley);
//
//        vasanth.enrollActivities(Sighting);
//        vasanth.enrollActivities(Fishing);
//        vasanth.enrollActivities(Acting);
//
//     System.out.println(vasanth.getBalance());



    }
}
