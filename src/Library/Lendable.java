package Library;

public interface Lendable {
    boolean lend(User user);
    void returnBook(User user);
    boolean isAvailabe();

    //since this is an interface so it is having only method declaration and no method definition and method defination will be there is implemented class which implements this interface this will implement compile time polymorphism basically we will override these methods in implemented classes and will provide the defination of these methods in implemented classes


}
