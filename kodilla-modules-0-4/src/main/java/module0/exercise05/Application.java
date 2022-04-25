package module0.exercise05;

public class Application {
    public static void main (String[] args) {
        Dog dog=new Dog(true,"głodny",4,"Pies");
        String type=dog.getType();
        int legs=dog.getLegs();
        System.out.println(type + " ma " + legs + " nogi");
    }
}
