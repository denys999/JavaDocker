package Shop;

public class PremiumAccount extends Account{
    float monthlyFee;

    @Override
    public void createAccount(int phoneNumber, String email, String loginName, String password) {
        System.out.println("Premium Account has been created");
    }
}
