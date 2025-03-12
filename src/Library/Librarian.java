package Library;

public class Librarian extends User{
    private String employeeNumber;

    public Librarian() {
        super();
        totalUsers++;
    }

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
        totalUsers++;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Name: " + getName());
        System.out.println("Contact Info: " + getContactInfo());
        System.out.println("Employee Number: " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    void addNewBook(Book book) {
        //Implementation
    }
    void removeBook(Book book) {
        //Implementation
    }
}
