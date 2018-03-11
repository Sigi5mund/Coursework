package Staff.Management;

import Staff.Employee;


public class Manager extends Employee {
         String deptName;


    public Manager(String name, Integer ni, Double salary, String deptName) {
        super(name, ni, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }


}
