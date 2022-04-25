package module1.excercise15;

public class ProductSalaryEmployee implements Employee{

    private double productNumber;

    public ProductSalaryEmployee(double productNumber) {
        this.productNumber = productNumber;
    }

    public double calculateSalary() {
        return this.productNumber * 5;
    }
}
