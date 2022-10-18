package dio.digital.bank;

import java.time.LocalDate;

public class CheckingAccount extends Account{
    public CheckingAccount(Client client) {
        super(client);
    }

    public void accountStatement(){
        System.out.println("=== Checking Account Statement ===");
        super.printStatement();
    }

//    public void pix(String key, double value){}

}
