package module0.exercise06;

public class User {
    private String name;
    private String surname;
    private String sex;
    private int age;
    private String email;

    public User(String name, String surname, String sex, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.email = email;
    }

    public void logginIn() { //zalogowanie
        System.out.println("Hello " + name + " " + surname + "! You are logged in!");
    }

    public void deleteAccount() {  //usuniecie konta
        this.name = "no data";
        this.surname = "no data";
        this.sex = "no data";
        this.age = 0;
        this.email = "no data";
        System.out.println("Account has been deleted");
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getSex() {
        return this.sex;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }
}
