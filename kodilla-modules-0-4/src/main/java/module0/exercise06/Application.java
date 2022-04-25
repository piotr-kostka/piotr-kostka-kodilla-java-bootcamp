package module0.exercise06;

public class Application {
    public static void main (String[] args) {
        ForumUser user = new ForumUser("pkostka","Piotr","Kostka","Male",27, "p.kostka@o2.com");
        user.logginIn(); //*zalogowanie
        user.addPost("Witam, to mój pierwszy post"); //dodanie posta
        user.getPostCount(); //licznik postów
        user.logOut(); //wylogowanie
        user.getLoginStatus(); //status konta
        user.commentPost("Witamy na forum", "Witam, to mój pierwszy post"); //odpowiedz na post
        user.deleteAccount(); //usunięcie konta
        user.userInfo(); //dane o koncie
    }
}
