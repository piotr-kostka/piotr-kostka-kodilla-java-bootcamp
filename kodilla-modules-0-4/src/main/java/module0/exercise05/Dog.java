package module0.exercise05;

public class Dog extends Animal{
    private boolean bark;
    private String hungry;

    public Dog(boolean bark, String hungry, int legs, String type){
        super(legs,type);
        this.bark=bark;
        this.hungry=hungry;
    }

    public void barkWhenHungry(){
        System.out.println("Dog is hungry");

    }

    public void barkWhenEnemy(){
        System.out.println("Enemy appear!");
    }
}
