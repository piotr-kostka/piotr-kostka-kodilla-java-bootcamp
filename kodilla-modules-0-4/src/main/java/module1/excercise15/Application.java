package module1.excercise15;

public class Application {
    public static void main (String[] args) {

        SalaryPayoutProcessor fixedProcessor = new SalaryPayoutProcessor(new FixedSalaryEmployee(2000.0,true));
        SalaryPayoutProcessor productProcessor = new SalaryPayoutProcessor(new ProductSalaryEmployee(500));

        fixedProcessor.processPayout();
        productProcessor.processPayout();
    }
}
