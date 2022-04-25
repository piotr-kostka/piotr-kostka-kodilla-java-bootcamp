package module1.excercise12;

public class Application {

    public static void main (String[] args) throws java.lang.Exception {

        ATMImpl atmimpl = new ATMImpl();

        atmimpl.deposit();
        atmimpl.withdraw();

        atmimpl.connectToBank();
        System.out.println(ATM.closeATM());
    }
}
