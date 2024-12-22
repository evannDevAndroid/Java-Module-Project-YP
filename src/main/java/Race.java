public class Race {

    private String leaderName = "";
    private int leaderDistance = 0;

    public void checkLeader(Car car) {

        int distance = 24 * car.getSpeed();

        if (distance > leaderDistance) {
            leaderDistance = distance;
            leaderName = car.getModel();
        }
    }

    public String getLeader() {
        return leaderName;
    }

}



