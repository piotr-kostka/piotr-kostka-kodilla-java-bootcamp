package module1.excercise14;

public class BankTransactionsRunner extends BankTransactions{

    protected void insertCard() {
        System.out.println("Wprowadź kartę:");
    }

    protected void insertPIN() {
        System.out.println("Wprowadź PIN:");
    }

    protected void insertCashAmount() {
        System.out.println("Wprowadź kwotę do wypłaty:");
    }

    protected void withdraw() {
        System.out.println("Trwa wypłacanie środków...");
    }

    protected void thankForUsing() {
        System.out.println("Dziękujemy za skorzystanie z usług naszego banku!");
    }
}
