package module2.excercise24;

public class Application {
    public static void main (String[] args) {

        EqualValidator validator = new EqualValidator();

        validator.validateShort();
        validator.validateDouble();
        validator.validateBoolean();
    }
}
