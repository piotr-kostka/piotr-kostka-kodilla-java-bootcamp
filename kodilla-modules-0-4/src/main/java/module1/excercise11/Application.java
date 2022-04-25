package module1.excercise11;

public class Application {
    public static void main (String[] args) throws java.lang.Exception {

        UserValidator userValidator = new UserValidator("Piotr", 31, 175);

        boolean validName = userValidator.validateName();
        boolean validAge = userValidator.validateAge();
        boolean validHeight = userValidator.validateHeight();

        if(validName) {
            if (validAge && validHeight) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is younger than 30 or doesn't have 160cm");
            }
        } else {
            System.out.println("No name.Program failed...");
        }
    }
}
