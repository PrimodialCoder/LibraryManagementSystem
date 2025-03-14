package Library;

import static Library.User.totalUsers;

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
        System.out.println("Total users are " + totalUsers);
//        dummy d = new dummy();
//        d.returnBook(m);
//        d.lend(l);

        Book b = new TextBook("1234", "Java", "James", "Programming", 5);
        b.lend(m);
//        b.returnBook(m);
        b.lend(l);
        b.returnBook(l);
        b.displayBookDetails();
        Book b1 = new NovelBook("5678", "Harry Potter", "JK Rowling", "Fantasy");
        b1.lend(m);
        b1.lend(l);
        b1.displayBookDetails();
//        b1.returnBook(m);
    }
}
