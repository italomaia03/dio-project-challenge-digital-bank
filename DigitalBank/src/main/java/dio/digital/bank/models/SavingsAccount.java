package dio.digital.bank.models;

import java.time.LocalDate;

public class SavingsAccount extends Account{
    private final LocalDate creationDate;
    public SavingsAccount(Client client) {
        super(client);
        this.creationDate = LocalDate.now();
    }

    public void accountStatement(){
        System.out.println("=== Savings Account Statement ===");
        System.out.println("Creation Date: "+this.creationDate);
        super.printStatement();
    }
    
}
