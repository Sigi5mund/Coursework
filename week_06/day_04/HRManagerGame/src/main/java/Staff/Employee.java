package Staff;

public class Employee {

     public String name;
     public Integer ni;
     public Double salary;
     public double increaseAmount;

     public Employee(String name, Integer ni, Double salary){
         this.name = name;
         this.ni = ni;
         this.salary = salary;
     }

     public void incrementSalary(double increasePercentage){
         increaseAmount = increasePercentage/100;
         this.salary = (salary + salary*increaseAmount);

     }

     public void payBonus(){
         this.salary= salary*0.01;
     }

    public String name() {
         return this.name;
    }

    public int ni() {
         return this.ni;
    }

    public double salary() {
         return this.salary;
    }
}
