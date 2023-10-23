import java.util.ArrayList;
import java.util.Random;
public class AirportSim {

    public static void main(String[] args) {
        ArrayList<Plane> landing = new ArrayList<>();
        ArrayList<Plane> takeoff = new ArrayList<>();
        ArrayList<Plane> none = new ArrayList<>();
        Random rand = new Random();
        Plane plane1 = new Plane();
        System.out.println("This plane takes off at: " + plane1.getTakeoffTime("4:20 AM"));
        System.out.println("The flight number is: " + plane1.getFlightNumber(" " + rand.nextInt(2000)));
        System.out.println("The arrival time is: " + plane1.getArrivalTime("6:50 AM"));
        System.out.println("The elapsed time is: " + plane1.elapsedTime(420, 650));
        System.out.println("This plane is: " + plane1.getPlaneStatus());
        System.out.println("The runway is: " + plane1.getStatusOfRunway("Dry"));
        Plane plane2 = new Plane();
        System.out.println("This plane takes off at: " + plane2.getTakeoffTime("7:15 AM"));
        System.out.println("The flight number is: " + plane2.getFlightNumber(" " + rand.nextInt(2000)));
        System.out.println("The arrival time is: " + plane2.getArrivalTime("10:15 AM"));
        System.out.println("The elapsed time is: " + plane2.elapsedTime(715, 1015));
        System.out.println("This plane is: " + plane2.getPlaneStatus());
        System.out.println("The runway is: " + plane2.getStatusOfRunway("Wet"));
        Plane plane3 = new Plane();
        System.out.println("This plane takes off at: " + plane3.getTakeoffTime("11:15 AM"));
        System.out.println("The flight number is: " + plane3.getFlightNumber(" " + rand.nextInt(2000)));
        System.out.println("The arrival time is: " + plane3.getArrivalTime("6:35 PM"));
        System.out.println("The elapsed time is: " + plane3.elapsedTime(1115, 1835));
        System.out.println("This plane is: " + plane3.getPlaneStatus());
        System.out.println("The runway is: " + plane3.getStatusOfRunway("Dry"));
        Plane plane4 = new Plane();
        System.out.println("This plane takes off at: " + plane4.getTakeoffTime("6:50 PM"));
        System.out.println("The flight number is: " + plane4.getFlightNumber(" " + rand.nextInt(2000)));
        System.out.println("The arrival time is: " + plane4.getArrivalTime("10:15 PM"));
        System.out.println("The elapsed time is: " + plane4.elapsedTime(1850, 2215));
        System.out.println("This plane is: " + plane4.getPlaneStatus());
        System.out.println("The runway is: " + plane4.getStatusOfRunway("Wet"));

        if (plane1.getPlaneStatus() == "Arriving") {
            landing.add(plane1);
        } else if (plane1.getPlaneStatus() == "Departing") {
            takeoff.add(plane1);
        } else if (plane1.getPlaneStatus() == "Idle") {
            none.add(plane1);
        }
        if (plane2.getPlaneStatus() == "Arriving") {
            landing.add(plane2);
        } else if (plane2.getPlaneStatus() == "Departing") {
            takeoff.add(plane2);
        } else if (plane2.getPlaneStatus() == "Idle") {
            none.add(plane2);
        }
        if (plane3.getPlaneStatus() == "Arriving") {
            landing.add(plane3);
        } else if (plane3.getPlaneStatus() == "Departing") {
            takeoff.add(plane3);
        } else if (plane3.getPlaneStatus() == "Idle") {
            none.add(plane3);
        }
        if (plane4.getPlaneStatus() == "Arriving") {
            landing.add(plane4);
        } else if (plane4.getPlaneStatus() == "Departing") {
            takeoff.add(plane4);
        } else if (plane4.getPlaneStatus() == "Idle") {
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
        System.out.println("The number of takeoffs is: " + runway.getTakeoffs());
        System.out.println("The wait time for takeoffs is: " + runway.getTakeoffWait());
        System.out.println("The number of landings is: " + runway.getLandings());
        System.out.println("The wait time for landings is: " + runway.getLandingWait());
        System.out.println("The number of idle planes is: " + runway.getIdle());
        System.out.println("The number of takeoffs accepted: " + runway.getTakeoffsAccepted());
        System.out.println("The number of landings accepted: " + runway.getLandingsAccepted());
        System.out.println("The number of takeoffs refused: " + runway.getTakeoffsRefused());
        System.out.println("The number of landings refused: " + runway.getLandingsRefused());
        System.out.println("The number of landing requests: " + runway.getLandingRequests());
}
}
