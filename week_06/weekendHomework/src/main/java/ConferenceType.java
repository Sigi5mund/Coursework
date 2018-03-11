public enum ConferenceType {



    WEDDING(50, 5000.00),
    MEETING(10, 250.00);


    public final int capacity;
    public final double cost;


    ConferenceType( int capacity, double cost) {
        this.capacity = capacity;
        this.cost = cost;
    }

    public Integer capacity() {
        return capacity;
    }

    public Double cost(){
        return cost;
    }

    }




