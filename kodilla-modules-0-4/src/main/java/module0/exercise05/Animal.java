package module0.exercise05;

public class Animal {
    private int legs;
    private String type;

    public Animal(int legs, String type){
        this.legs=legs;
        this.type=type;
    }
    public int getLegs(){
        return this.legs;
    }
    public String getType(){
        return this.type;
    }
}
