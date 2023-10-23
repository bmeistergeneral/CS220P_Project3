import java.util.Random;
public class Plane {
    public static final int landing = 0;
    public static final int takeoff = 1;

    private int priority;
    private int landingTime;

    static String pStatus[] = {"Departing", "Arriving", "No requests"};
    private String status;
    public Plane() {
       status = chooseStatus(pStatus);
    }

    public int getPriority() {
        return priority;
    }

    public boolean isLanding() {
        return priority == landing;
    }

    public void setLandingTime(int value) {
        landingTime = value;
    }

    private String chooseStatus(String[] choices) {
        Random rand = new Random();
        return choices [rand.nextInt(choices.length)];
    }
    public String getFlightNumber(String number) {
        return number;
    }

    public String getTakeoffTime(String takeoffTime) {
        return takeoffTime;
    }
    public String getArrivalTime(String landingTime) {
        return landingTime;
    }
    public String getPlaneStatus() {
        return status;
    }
    public int elapsedTime(int takeoffTime, int landingTime) {
        return landingTime - takeoffTime;
    }
    public String getStatusOfRunway(String runway) {
        return runway;
    }
}
