import java.util.Random;
public class Plane {

    static String pStatus[] = {"Departing", "Arriving", "Idle"};
    private String status;
    public Plane() {
       status = chooseStatus(pStatus);
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
