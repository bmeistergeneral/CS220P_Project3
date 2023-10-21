public class Runway {
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
    public int getListLimit() {
        return listlimit;
    }

    public int getLandingRequests() {
        return landingRequests;
    }

    public int getLandings() {
        return landings;
    }

    public int getTakeoffs() {
        return takeoffs;
    }

    public int getLandingsAccepted() {
        return landingsAccepted;
    }

    public int getTakeoffsAccepted() {
        return takeoffsAccepted;
    }

    public int getLandingsRefused() {
        return landingsRefused;
    }

    public int getTakeoffsRefused() {
        return takeoffsRefused;
    }

    public int getLandingWait() {
        return landingWait;
    }

    public int getTakeoffWait() {
        return takeoffWait;
    }

    public int getIdle() {
        return idle;
    }
}
