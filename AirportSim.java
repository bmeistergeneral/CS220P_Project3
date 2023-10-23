import java.util.ArrayList;
import java.util.Random;
public class AirportSim {
    public static int getRandomMinute(int hours) {
        return (int) (Math.random() * (hours * 60));
    }
    public static void main(String[] args) {
        final int takeOffTime = 5;
        final int landingTime = 3;
        final int hours = 12;
        ArrayList<Plane> landing = new ArrayList<>();
        ArrayList<Plane> takeoff = new ArrayList<>();
        ArrayList<Plane> none = new ArrayList<>();
        Random rand = new Random();
        Plane plane1 = new Plane();
        System.out.println("The flight number is: " + plane1.getFlightNumber(" " + rand.nextInt(2000)));
        System.out.println("The arrival time is: " + plane1.getArrivalTime("6:5 AM"));
        System.out.println("This plane is: " + plane1.getPlaneStatus());
        System.out.println("The runway is: " + plane1.getStatusOfRunway("Dry"));
        Plane plane2 = new Plane();
        System.out.println("The flight number is: " + plane2.getFlightNumber(" " + rand.nextInt(2000)));
        System.out.println("The arrival time is: " + plane2.getArrivalTime("2:35 PM"));
        System.out.println("This plane is: " + plane2.getPlaneStatus());
        System.out.println("The runway is: " + plane2.getStatusOfRunway("Wet"));
        Plane plane3 = new Plane();
        System.out.println("The flight number is: " + plane3.getFlightNumber(" " + rand.nextInt(2000)));
        System.out.println("The arrival time is: " + plane3.getArrivalTime("2:35 PM"));
        System.out.println("This plane is: " + plane3.getPlaneStatus());
        System.out.println("The runway is: " + plane3.getStatusOfRunway("Dry"));
        Plane plane4 = new Plane();
        System.out.println("The flight number is: " + plane4.getFlightNumber(" " + rand.nextInt(2000)));
        System.out.println("The arrival time is: " + plane4.getArrivalTime("2:35 PM"));
        System.out.println("The flight number is: " + plane4.getPlaneStatus());
        System.out.println("The flight number is: " + plane4.getStatusOfRunway("Wet"));

        if (plane1.getPlaneStatus() == "Arriving") {
            landing.add(plane1);
        } else if (plane1.getPlaneStatus() == "Departing") {
            takeoff.add(plane1);
        } else if (plane1.getPlaneStatus() == "No requests") {
            none.add(plane1);
        }
        if (plane2.getPlaneStatus() == "Arriving") {
            landing.add(plane2);
        } else if (plane2.getPlaneStatus() == "Departing") {
            takeoff.add(plane2);
        } else if (plane2.getPlaneStatus() == "No requests") {
            none.add(plane2);
        }
        if (plane3.getPlaneStatus() == "Arriving") {
            landing.add(plane3);
        } else if (plane3.getPlaneStatus() == "Departing") {
            takeoff.add(plane3);
        } else if (plane3.getPlaneStatus() == "No requests") {
            none.add(plane3);
        }
        if (plane4.getPlaneStatus() == "Arriving") {
            landing.add(plane4);
        } else if (plane4.getPlaneStatus() == "Departing") {
            takeoff.add(plane4);
        } else if (plane4.getPlaneStatus() == "No requests") {
            none.add(plane4);
        }
        int landingPlanes = landing.size();
        if (landingPlanes != 0) {
            System.out.println("Sorry, can't take off yet! Please wait");
            StatusTest land = new StatusTest(RStatus.LAND);
            land.tellRunwayStatus();
        }
        int noRequests = none.size();
        if (landingPlanes == 0 && noRequests < 4) {
            System.out.println("You can take off!");
            StatusTest takeoff1 = new StatusTest(RStatus.TAKEOFF);
            takeoff1.tellRunwayStatus();
        }
        if (landingPlanes >= 4) {
            System.out.println("Please go to a different airport.");
        }
        int takeoffs = takeoff.size();
        if (takeoffs >= 4) {
            System.out.println("Sorry, can't take off! Please wait.");
        }
        if (takeoffs == 4) {
            StatusTest idle = new StatusTest(RStatus.IDLE);
            idle.tellRunwayStatus();
        }

        Runway runway = new Runway(4, landingPlanes, takeoffs,4, 4, 4, 4, 0, 0, 10, 10, noRequests);
        System.out.println("The limit is: " + runway.getListLimit());
        System.out.println("The number of takeoff requests is: " + runway.getTakeoffs());
        System.out.println("The wait time for takeoffs is: " + runway.getTakeoffWait());
        System.out.println("The number of landing requests is: " + runway.getLandings());
        System.out.println("The wait time for landings is: " + runway.getLandingWait());
        System.out.println("The number of idle planes is: " + runway.getIdle());
}
}
