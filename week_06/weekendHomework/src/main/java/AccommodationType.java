public enum AccommodationType {


    SINGLE(1, 20.00),
    DOUBLE(2, 40.00),
    FAMILY(4, 70.00);


    public final int capacity;
    public final double cost;


    AccommodationType( int capacity, double cost) {
        this.capacity = capacity;
        this.cost = cost;
    }

    public int capacity(){
        return capacity;
    }

    public double cost(){
        return cost;
    }


}
