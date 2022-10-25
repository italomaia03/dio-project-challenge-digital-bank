package dio.digital.bank.controllers;

import dio.digital.bank.models.*;

import java.util.Scanner;

public class AccountOperation {
    static Scanner input = new Scanner(System.in);

    static void chooseAccountOption(Bank bank, Client client){
        Account account1 = findClientAccount(bank, client);
        int choice = input.nextInt();
        if (choice == 1){
            account1.printStatement();
        } else if (choice == 2) {
            System.out.print("Withdraw amount: $");
            account1.withdraw(input.nextDouble());
        } else if (choice == 3) {
            System.out.print("Deposit amount: $");
            account1.deposit(input.nextDouble());
        } else if(choice == 4){
            System.out.println("Inform the account's owner SSN");
            System.out.print("SSN: ");
            String ssn = input.next();
            System.out.println("Inform the transference amount");
            System.out.print("Amount: $");
            double transferenceAmount = input.nextDouble();
            account1.transfer(findClientAccount(bank, ClientOperation.findClient(bank, ssn)), transferenceAmount);
        } else {
            System.exit(0);
        }
    }

    public static CheckingAccount createCheckingAccount(Client client){
        return new CheckingAccount(client);
    }

    public static SavingsAccount createSavingsAccount(Client client){
        return new SavingsAccount(client);
    }

    public static Account findClientAccount(Bank bank, Client client){
        return bank.getAccounts().stream().filter(account -> client.equals(account.getClient())).findAny().get();
    }

}
