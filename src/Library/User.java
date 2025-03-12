package Library;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;

    public static int totalUsers = 0;

    public final int getTotalUsers() {
        return totalUsers;
    }

    String getUserId() {
        return this.userId;
    }
    String getName() {
        return this.name;
    }
    String getContactInfo() {
        return this.contactInfo;
    }

    //no need to set userId as it is generated automatically
//    void setUserId(String userId) {
//        this.userId = userId;
//    }
    void setName(String name) {
        this.name = name;
    }
    void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    // Non parameterized constructor to generate unique user id using generateUniqueId() method
    public User(){
        totalUsers++;
        this.userId = generateUniqueId();
    }
    // Parameterized constructor to set name and contact info
    public User(String name, String contactInfo){
        totalUsers++;
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Copy constructor to copy user object
    public User(User user){
        totalUsers++;
        this.userId = user.generateUniqueId();//Important: This will generate a new unique id for the copied user object
        this.name = user.getName();
        this.contactInfo = user.getContactInfo();
    }

    private String generateUniqueId(){
        return "user-" + totalUsers;
    }
    //Abstract method to display dashboard and check if user can borrow books
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
    //Abstract Methods: By declaring displayDashboard and canBorrowBooks as abstract, the User class defines a contract that all subclasses must fulfill. This ensures that any subclass of User will have these methods, but the implementation can vary.


    //Subclass Implementation: Subclasses like Librarian and Member will provide their own implementations of these methods. This allows each subclass to define behavior specific to its role.


    //Polymorphic Behavior: When a method that uses these abstract methods is called on a User reference, the actual method that gets executed is the one defined in the subclass. This is known as dynamic method dispatch.



}
