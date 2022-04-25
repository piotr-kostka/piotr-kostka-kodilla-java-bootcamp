package module1.excercise12;

public interface ATM {

    void deposit();
    void withdraw();

    default void connectToBank() {
        System.out.println("ATM is connected to bank");
    }

    static String closeATM() {
        return "ATM is closed";
    }
}
