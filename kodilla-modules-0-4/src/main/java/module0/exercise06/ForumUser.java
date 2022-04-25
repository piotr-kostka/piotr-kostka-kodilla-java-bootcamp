package module0.exercise06;

public class ForumUser extends User{
    private String login;
    boolean loginStatus;
    private int postCount;

    public ForumUser(String login, String name, String surname, String sex, int age, String email) {
        super(name, surname, sex, age, email);
        this.login = login;

        postCount = 0;
        loginStatus = true;
    }
    public String getLogin(){
        return this.login;
    }
    public void getLoginStatus() { //sprawdzenie czy użytkownik jest aktywny
        if (loginStatus) {
            System.out.println("User is currently logged in");
        }
        else {
            System.out.println("User is not logged in");
        }
    }
    public void getPostCount() { //licznik postów
        System.out.println("Post counter: " + postCount);
    }

    public void logOut() { //wylogowanie
        loginStatus = false;
    }

    public void addPost(String addPost) { //dodanie posta
        System.out.println("Added post: " + addPost);
        postCount++;
    }

    public void commentPost(String comment, String commentedPost) { //komentarz do posta
        System.out.println(login + " commented post: '" + commentedPost + "':");
        System.out.println("Comment: " + comment);
    }
    public void userInfo() { //informacje o koncie

        System.out.println(" ");
        System.out.println("Account details:");
        System.out.println("User: " + getLogin());
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Sex: " + getSex());
        System.out.println("Age: " + getAge());
        System.out.println("E-mail: " + getEmail());
    }
}
