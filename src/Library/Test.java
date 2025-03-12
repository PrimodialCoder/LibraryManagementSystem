package Library;

public class Test {
    public static void main(String[] args) {
//        User u = new User();
//        User u1 = new User("John", " 1234567890");
//        User u2 = new User(u1);
//        System.out.println(u1.getName());
//        System.out.println(u2.getName());
        User m = new Member("John", "1234567890");
        User l = new Librarian("Jane", "0987654321", "1234");
        m.displayDashboard();
        l.displayDashboard();
    }
}
