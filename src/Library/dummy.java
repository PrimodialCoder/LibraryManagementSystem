package Library;

public class dummy implements Lendable {
    @Override
    public boolean lend(User user) {
        System.out.println("Lending book to " + user.getUserId() + " name " + user.getName());
        return false;
    }
    @Override
    public void returnBook(User user) {
        System.out.println("Returning book " + user.getUserId());
    }
    @Override
    public boolean isAvailabe() {
        return false;
    }
}
