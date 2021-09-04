package Shop;

public class FreeAccount extends Account{
    @Override
    public void createAccount(int phoneNumber, String email, String loginName, String password) {
        super.createAccount(phoneNumber, email, loginName, password);
        System.out.println("Free Account has been created");
    }
}
