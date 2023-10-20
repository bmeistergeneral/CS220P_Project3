import java.util.Random;
public class Plane {
    static String pStatus[] = {"Departing", "Arriving", "No requests"};
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
    public String getArrivalTime(String time) {
        return time;
    }
    public String getPlaneStatus() {
        return status;
    }
    public String getStatusOfRunway(String runway) {
        return runway;
    }
}
