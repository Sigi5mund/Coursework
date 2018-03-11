import java.util.ArrayList;

public class Guest {


    protected String name;
    protected String surname;
    protected String country;
    protected Boolean checkedIn;
    protected Boolean settledBill;
    protected Integer nights;
    protected ArrayList<Meal> meals;


       public Guest(String name, String surname, String country){
           this.name = name;
           this.surname = surname;
           this.country = country;
           this.checkedIn = false;
           this. settledBill = false;
           this.nights = 1;
           this.meals = new ArrayList<>();
       }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getCheckedin() {
        return checkedIn;
    }

    public void setCheckedin(Boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public Boolean getSettledBill() {
        return settledBill;
    }

    public void setSettledBill(Boolean settledBill) {
        this.settledBill = settledBill;
    }

    public Integer getNights() {
        return nights;
    }

    public void setNights(Integer nights) {
        this.nights = nights;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
    }
}
