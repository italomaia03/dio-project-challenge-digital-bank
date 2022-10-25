package dio.digital.bank;

import dio.digital.bank.controllers.AccountOperation;
import dio.digital.bank.controllers.ClientOperation;
import dio.digital.bank.models.Bank;
import dio.digital.bank.models.Client;

public class Teste {
    public static void main(String[] args) {
        Bank bank = new Bank("BB");
        Client client = ClientOperation.registerNewClient();
        bank.setAccounts(AccountOperation.createCheckingAccount(client));
        AccountOperation.findClientAccount(bank, client).printStatement();

    }

}
