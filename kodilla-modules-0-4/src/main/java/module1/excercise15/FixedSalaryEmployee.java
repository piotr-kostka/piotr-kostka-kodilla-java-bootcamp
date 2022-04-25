package module1.excercise15;

public class FixedSalaryEmployee implements Employee{

    private double salary;
    private boolean extraSale;

    public FixedSalaryEmployee(double salary, boolean extraSale) {
        this.salary = salary;
        this.extraSale = extraSale;
    }

    public double calculateSalary() {
        if (extraSale == true) {
            return this.salary + 0.2 * this.salary;
        } else {
            return this.salary;
        }
    }
}
