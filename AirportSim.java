import java.util.ArrayList;
import java.util.Random;
public class AirportSim {
// timesOfDay[(rand.nextInt(timesOfDay.length))]
    public static void main(String[] args) {
        ArrayList<Plane> landing = new ArrayList<>();
        ArrayList<Plane> takeoff = new ArrayList<>();
        ArrayList<Plane> none = new ArrayList<>();
        Random rand = new Random();
        final String[] timesOfDay = {
                "AM",
                "PM"
        };
        // Creating plane objects
        // Elapsed time intervals unable to be programmed and documented.
        Plane plane1 = new Plane();
        String to = "The takeoff time is: " + plane1.getTakeoffTime((rand.nextInt(4, 6) + ":" + rand.nextInt(0, 6) + rand.nextInt(0, 10) + " "  + "AM"));
        System.out.println(to);
        System.out.println("The flight number is: " + plane1.getFlightNumber(" " + rand.nextInt(2000)));
        String la = "The arrival time is: " + plane1.getArrivalTime( rand.nextInt(8, 10) + ":" + rand.nextInt(0, 6) + rand.nextInt(0, 10) + " "  + "AM");
        System.out.println(la);
        System.out.println("The elapsed time is: " + ((la.charAt(la.length() - 7)) + (la.charAt(la.length() - 5)) + (la.charAt(la.length() - 4)) - (to.charAt(to.length() - 7)) + (to.charAt(to.length() - 5)) + (to.charAt(to.length() - 4))));
        System.out.println("This plane is: " + plane1.getPlaneStatus());
        System.out.println("The runway is: " + plane1.getStatusOfRunway("Wet"));
        System.out.println();
        Plane plane2 = new Plane();
        String to1 = "The takeoff time is: " + plane2.getTakeoffTime((rand.nextInt(10, 11) + ":" + rand.nextInt(0, 6) + rand.nextInt(0, 10) + " "  + "AM"));
        System.out.println(to1);
        System.out.println("The flight number is: " + plane2.getFlightNumber(" " + rand.nextInt(2000)));
        String la1 = "The arrival time is: " + plane2.getArrivalTime( rand.nextInt(2, 4) + ":" + rand.nextInt(0, 6) + rand.nextInt(0, 10) + " "  + "PM");
        System.out.println(la1);
        System.out.println("The elapsed time is: " + ((la1.charAt(la1.length() - 7)) + (la1.charAt(la1.length() - 5)) + (la1.charAt(la1.length() - 4)) - (to1.charAt(to1.length() - 7)) + (to1.charAt(to1.length() - 5)) + (to1.charAt(to1.length() - 4))));
        System.out.println("This plane is: " + plane2.getPlaneStatus());
        System.out.println("The runway is: " + plane2.getStatusOfRunway("Dry"));
        System.out.println();
        Plane plane3 = new Plane();
        String to2 = "The takeoff time is: " + plane3.getTakeoffTime((rand.nextInt(4, 6) + ":" + rand.nextInt(0, 6) + rand.nextInt(0, 10) + " "  + "PM"));
        System.out.println(to2);
        System.out.println("The flight number is: " + plane3.getFlightNumber(" " + rand.nextInt(2000)));
        String la2 = "The arrival time is: " + plane3.getArrivalTime( rand.nextInt(8, 10) + ":" + rand.nextInt(0, 6) + rand.nextInt(0, 10) + " "  + "PM");
        System.out.println(la2);
        System.out.println("The elapsed time is: " + ((la2.charAt(la2.length() - 7)) + (la2.charAt(la2.length() - 5)) + (la2.charAt(la2.length() - 4)) - (to2.charAt(to2.length() - 7)) + (to2.charAt(to2.length() - 5)) + (to2.charAt(to2.length() - 4))));
        System.out.println("This plane is: " + plane3.getPlaneStatus());
        System.out.println("The runway is: " + plane3.getStatusOfRunway("Dry"));
        System.out.println();
        Plane plane4 = new Plane();
        String to3 = "The takeoff time is: " + plane4.getTakeoffTime((rand.nextInt(10, 11) + ":" + rand.nextInt(0, 6) + rand.nextInt(0, 10) + " "  + "PM"));
        System.out.println(to3);
        System.out.println("The flight number is: " + plane4.getFlightNumber(" " + rand.nextInt(2000)));
        String la3 = "The arrival time is: " + plane4.getArrivalTime( rand.nextInt(2, 4) + ":" + rand.nextInt(0, 6) + rand.nextInt(0, 10) + " "  + "AM");
        System.out.println(la3);
        System.out.println("The elapsed time is: " + ((la3.charAt(la3.length() - 7)) + (la3.charAt(la3.length() - 5)) + (la3.charAt(la3.length() - 4)) - (to3.charAt(to3.length() - 7)) + (to3.charAt(to3.length() - 5)) + (to3.charAt(to3.length() - 4))));
        System.out.println("This plane is: " + plane4.getPlaneStatus());
        System.out.println("The runway is: " + plane4.getStatusOfRunway("Wet"));
        System.out.println();


        // Plane status detection
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
        // if landing queue contains planes, then a plane cannot take off.
        int landingPlanes = landing.size();
        if (landingPlanes != 0) {
            System.out.println("Sorry, can't take off yet! Please wait");
            StatusTest land = new StatusTest(RStatus.LAND);
            land.tellRunwayStatus();
        }
        // if there are no landing planes and runway is idle, then the plane can take off.
        int noRequests = none.size();
        if (landingPlanes == 0 && noRequests < 4) {
            System.out.println("You can take off!");
            StatusTest takeoff1 = new StatusTest(RStatus.TAKEOFF);
            takeoff1.tellRunwayStatus();
        }
        // if there are more planes landing at a time than allowed, planes must change course.
        if (landingPlanes >= 4) {
            System.out.println("Please go to a different airport.");
        }
        // if there are more than the allowed number of planes taking off, plane must wait.
        int takeoffs = takeoff.size();
        if (takeoffs >= 4) {
            System.out.println("Sorry, can't take off! Please wait.");
        }
        // if all planes have taken off, runway is idle.
        if (takeoffs == 4) {
            StatusTest idle = new StatusTest(RStatus.IDLE);
            idle.tellRunwayStatus();
        }
        // creating a new runway object
        Runway runway = new Runway(4, landingPlanes, takeoffs,4, 4, 4, 4, 0, 0, 10, 10, noRequests);
        System.out.println("The limit is: " + runway.getListLimit());
        System.out.println("The number of takeoffs scheduled is: " + runway.getTakeoffs());
        System.out.println("The wait time for takeoffs is: " + runway.getTakeoffWait());
        System.out.println("The number of landings scheduled is: " + runway.getLandings());
        System.out.println("The wait time for landings is: " + runway.getLandingWait());
        System.out.println("The number of idle planes is: " + runway.getIdle());
        System.out.println("The number of takeoffs accepted: " + runway.getTakeoffsAccepted());
        System.out.println("The number of landings accepted: " + runway.getLandingsAccepted());
        System.out.println("The number of takeoffs refused: " + runway.getTakeoffsRefused());
        System.out.println("The number of landings refused: " + runway.getLandingsRefused());
        System.out.println("The number of landing requests: " + runway.getLandingRequests());
        System.out.println("The number of takeoff requests: " + runway.getTakeoffRequests());
}
}
