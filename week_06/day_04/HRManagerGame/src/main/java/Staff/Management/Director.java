package Staff.Management;

import Staff.Employee;

public class Director extends Employee {

    double budget;

    public Director(String name, Integer ni, Double salary, Double budget) {
        super(name, ni, salary);
        this.budget = budget;
    }

    private double seeBudget(){
        return this.budget;
    }
}
