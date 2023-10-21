public enum RStatus {
        IDLE, LAND, TAKEOFF
    } class StatusTest {
        RStatus status;
        public StatusTest(RStatus status) {
            this.status = status;
        }
    public void tellRunwayStatus() {
        switch (status) {
            case IDLE -> System.out.println("Nothing happening on the runway!");
            case LAND -> System.out.println("A plane is landing!");
            case TAKEOFF -> System.out.println("A plane is taking off!");
        }
    }
}
