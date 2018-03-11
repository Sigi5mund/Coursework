

public class Runner implements IRun {
    private int totalDistance;
    private int hydration;



    public void run(int distance) {
        totalDistance += distance;
    }

    public void drinkWater() {
        hydration++;
    }




}