package module1.excercise11;

public class UserValidator {

    private final String name;
    private final double age;
    private final double height;


    public UserValidator(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean validateName() {

        return name != null;
    }

    public boolean validateAge() {

        return age > 30;
    }

    public boolean validateHeight() {

        return height > 160;
    }
}
