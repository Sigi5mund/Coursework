public class Customer {

    String name;
    int age;
    int height;
    int money;
    String exclamation;
    Ride favouriteRide;

    public Customer(String name, int age, int height, int money, String exclamation, Ride favouriteRide) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.money = money;
        this.exclamation = exclamation;
        this.favouriteRide = favouriteRide;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int newtotal){
        this.money = newtotal;
    }

    public String getExclamation() {
        return exclamation;
    }

    public Ride getFavouriteRide() {
        return favouriteRide;
    }

    public void payFare(int cost){
        this.money = this.money - cost;
    }
}

