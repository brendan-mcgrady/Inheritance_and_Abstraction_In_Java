package staff.management;

public class Director extends Manager {

    // Add a private property to store a double value budget.

    private double budget;

    // Create a constructor for Director that includes the parameters needed for Manager and the budget parameter.

    public Director(String name, String nINumber, double salary, String deptName, double budget) {
        super(name, nINumber, salary, deptName);
        this.budget = budget;
    }

    // Create a getter method for this property.

    public double getBudget() {
        return budget;
    }

    // Override the payBonus in director to return 2% of their salary.
    public double payBonus() {
        return super.getSalary() * 0.02;
    }
}