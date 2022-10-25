import dio.digital.bank.controllers.BankOperation;
import dio.digital.bank.models.*;


public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Banco do Brasil");
        do {
            BankOperation.chooseAccessOption(bank);
        } while (true);
    }
}

/* there is plenty of room to improve this code;
    it is pretty much functional as of it now;
    the next steps I plan to implement are:
        * implement the loops inside the static methods;
        * add more banks;
        * a functionality to let the client choose which bank's system he wants to access;
        * a functionality to compel clients to have only one account of each kind per bank;
 */