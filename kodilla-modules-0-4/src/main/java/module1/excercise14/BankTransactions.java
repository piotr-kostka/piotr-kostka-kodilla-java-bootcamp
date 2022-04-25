package module1.excercise14;

abstract class BankTransactions {

    abstract protected void insertCard();
    abstract protected void insertPIN();
    abstract protected void insertCashAmount();
    abstract protected void withdraw();
    abstract protected void thankForUsing();



    private void acceptWithdrawalRequest() {
        System.out.println("Przyjęto prośbę o wypłatę środków...");
    }

    private void checkBalance() {
        System.out.println("Sprawdzanie stanu konta...");
    }

    private void confirmWithdrawal() {
        System.out.println("Wypłata możliwa do wykonania");
    }

    public void run() {
        this.insertCard();
        this.insertPIN();
        this.insertCashAmount();
        this.acceptWithdrawalRequest();
        this.checkBalance();
        this.confirmWithdrawal();
        this.withdraw();
        this.thankForUsing();
    }
}
