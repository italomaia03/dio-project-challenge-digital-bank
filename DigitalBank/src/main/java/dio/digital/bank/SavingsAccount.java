package dio.digital.bank;

public class SavingsAccount extends Account{
    public SavingsAccount(Client client) {
        super(client);
    }

    public void accountStatement(){
        System.out.println("=== Savings Account Statement ===");
        super.printStatement();
    }
}
