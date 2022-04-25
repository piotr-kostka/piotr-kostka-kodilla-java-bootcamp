package module2.excercise24;

public class EqualValidator {

    short x = 10;
    double y = 3.14;
    boolean z = true;

    Short a = 10;
    Double b = 3.14;
    Boolean c = true;

    public void validateShort() {
        if (a.equals(x)) {
            System.out.println("Wartości short są równe");
        } else {
            System.out.println("Nierówne");
        }
    }

    public void validateDouble() {
        if (b.equals(y)) {
            System.out.println("Wartości double są równe");
        } else {
            System.out.println("Nierówne");
        }
    }

    public void validateBoolean() {
        if (c.equals(z)) {
            System.out.println("Wartości boolean są równe");
        } else {
            System.out.println("Nierówne");
        }
    }
}
