package Library;

import java.sql.SQLOutput;

public class Member extends User{
    private int borrowedBooksCount;
    protected final int MAX_BORROW_LIMIT = 5;

    //constructor non parameterized
    public Member() {
        super();
        this.borrowedBooksCount = 0;
    }

    //constructor parameterized
    public Member(String name, String contactInfo) {
        super(name, contactInfo);
        this.borrowedBooksCount = 0;
    }

    //override method displayDashboard from abstract user class
    @Override
    public void displayDashboard() {

        System.out.println("Member Dashboard");
        System.out.println("Member UUID: " + getUserId());
        System.out.println("Name: " + getName());
        System.out.println("Contact Info: " + getContactInfo());
        System.out.println("Borrowed Books: " + borrowedBooksCount);
    }

    //override method canBorrowBooks from abstract user class
    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
