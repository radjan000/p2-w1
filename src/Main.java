// psvm -> public static void main(String[] args){}
// sout -> System.out.println();
// CTRL + D -> duplikacja linijki
// ALT + Ins -> generator kodu
// CTRL + ALT + L -> formatowanie
// CTRL + / koment/odkoment

public class Main {
    public static void main(String[] args) {
        System.out.println("HELLO!");
        User u1 = new User(email:"rj@rj.pl", password: "rj");
        User u2 = new User(email:"rj2@rj.pl", password: "rj2");
        User u3 = new User(email:"rj3@rj.pl", password: "rj3");
        System.out.println(u1.toString());
        System.out.println(u2.toString());
        System.out.println("KONIEC");

    }
}
