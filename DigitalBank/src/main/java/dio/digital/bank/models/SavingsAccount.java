package dio.digital.bank.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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

    public void setIncome(LocalDate c){
        double monthlyIncome = 0.005;
        long months = creationDate.until(c, ChronoUnit.MONTHS);
        if (this.creationDate.getDayOfMonth() <= c.getDayOfMonth())
            this.balance *= (1+(monthlyIncome*months));
    }
}
