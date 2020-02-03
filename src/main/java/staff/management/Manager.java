// Create a class for Manager.

package staff.management;

import staff.Employee;

public class Manager extends Employee {


    // Add a property to store the department name in a property called deptName.

    private String deptName;

    // Create a constructor that includes all the parameters needed for Employee and deptName.

    public Manager(String name, String nINumber, double salary, String deptName) {
        super(name, nINumber, salary);
        this.deptName = deptName;
    }

    // Add a getter method for deptName.

    public String deptName() {
        return deptName;
    }

}