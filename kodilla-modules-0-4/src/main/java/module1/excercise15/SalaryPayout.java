package module1.excercise15;

abstract class SalaryPayout {
    private Employee employee;

    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }

    protected abstract void payout();

    public void processPayout() {
        System.out.println("Creating payment for: " + this.employee.calculateSalary() + " PLN...");
        this.payout();
        System.out.println("Payout has been completed!");
    }
}
