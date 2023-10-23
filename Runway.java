// import java.util.LinkedList;
// import java.util.Queue;
public class Runway {
    // Queue<Plane> landing = new LinkedList<>();
    // Queue<Plane> takeoff = new LinkedList<>();
    int listlimit;
    int landingRequests;
    int takeoffRequests;
    int landings;
    int takeoffs;
    int landingsAccepted;
    int takeoffsAccepted;
    int landingsRefused;
    int takeoffsRefused;
    int landingWait;
    int takeoffWait;
    int idle;
    // all the runway criteria.
    public Runway(int listlimit, int landingRequests, int takeoffRequests, int landings, int takeoffs, int landingsAccepted, int takeoffsAccepted, int landingsRefused, int takeoffsRefused, int landingWait, int takeoffWait, int idle) {
        this.listlimit = listlimit;
        this.landingRequests = landingRequests;
        this.takeoffRequests = takeoffRequests;
        this.landings = landings;
        this.takeoffs = takeoffs;
        this.landingsAccepted = landingsAccepted;
        this.takeoffsAccepted = takeoffsAccepted;
        this.landingsRefused = landingsRefused;
        this.takeoffsRefused = takeoffsRefused;
        this.landingWait = landingWait;
        this.takeoffWait = takeoffWait;
        this.idle = idle;
    }
    // number of planes allowed in simulation.
    public int getListLimit() {
        return listlimit;
    }
    // # of landing requests
    public int getLandingRequests() {
        return landingRequests;
    }
    // landings
    public int getLandings() {
        return landings;
    }
    // takeoffs
    public int getTakeoffs() {
        return takeoffs;
    }
    // accepted landings (will be all of them for the purposes of the simulation)
    public int getLandingsAccepted() {
        return landingsAccepted;
    }
    // accepted takeoffs (will be all of them for the purposes of the simulation)
    public int getTakeoffsAccepted() {
        return takeoffsAccepted;
    }
    // landings refused (none for the simulation)
    public int getLandingsRefused() {
        return landingsRefused;
    }
    // takeoffs refused (none for the simulation)
    public int getTakeoffsRefused() {
        return takeoffsRefused;
    }
    // wait time for landings
    public int getLandingWait() {
        return landingWait;
    }
    // wait time for takeoffs
    public int getTakeoffWait() {
        return takeoffWait;
    }

    public int getIdle() {
        return idle;
    }
}
