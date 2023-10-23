import java.util.Random;
public class Plane {
    // plane statuses
    static String pStatus[] = {"Departing", "Arriving", "Idle"};
    private String status;
    public Plane() {
       status = chooseStatus(pStatus);
    }
    // plane status will change randomly.
    private String chooseStatus(String[] choices) {
        Random rand = new Random();
        return choices [rand.nextInt(choices.length)];
    }
    // flight numbers
    public String getFlightNumber(String number) {
        return number;
    }
    // takeoff time
    public String getTakeoffTime(String takeoffTime) {
        return takeoffTime;
    }
    // arrival time
    public String getArrivalTime(String landingTime) {
        return landingTime;
    }
    // status
    public String getPlaneStatus() {
        return status;
    }
    // time between takeoff and landing
    public int elapsedTime(int takeoffTime, int landingTime) {
        return landingTime - takeoffTime;
    }
    // runway status
    public String getStatusOfRunway(String runway) {
        return runway;
    }
}
