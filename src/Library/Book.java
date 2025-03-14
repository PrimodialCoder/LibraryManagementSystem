package Library;

public abstract class Book implements Lendable{

    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public Book() {
        this.isAvailable = true;
    }
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public Book(Book book) {
        this.isbn = book.getIsbn();
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.isAvailable = true;
    }

    @Override
    public boolean lend(User user) {
        if (user.canBorrowBooks()  && isAvailable) {
            System.out.println("Book has been borrowed by " + user.getName());
            this.isAvailable = false;
            return true;
        } else {
            System.out.println("Book cannot be borrowed by " + user.getName());
            return false;
        }
    }
    @Override
    public void returnBook(User user) {
        System.out.println("Book has been returned by " + user.getName());
        this.isAvailable = true;
    }
    @Override
    public boolean isAvailabe() {
        if(this.isAvailable) {
            System.out.println("Book is available");
            return true;
        } else {
            System.out.println("Book is not available");
            return false;
        }
    }
    //this is an abstract method which is declared here and will be implemented in the implemented class i.e. textbook and novel books class
    public abstract void displayBookDetails();
}
