package dio.digital.bank.controllers;

import dio.digital.bank.models.*;
import dio.digital.bank.views.OperationInterface;

import java.util.Scanner;

public class BankOperation {
    static Scanner input = new Scanner(System.in);

    public static void chooseAccessOption(Bank bank) {
        OperationInterface.accessMenu();
        int choice = input.nextInt();
        if (choice == 1) {
            try {
                Client client = ClientOperation.logInClient(bank);
                if (ClientOperation.checkClientRegistration(bank, client)) {
                    System.out.println("Welcome, Mr/Ms " + client.getName());
                    chooseBankOption(bank, client);
                }
            } catch (IndexOutOfBoundsException exception) {
                System.out.println("You are not registered");
            }
    } else if(choice == 2) {
        Client client = ClientOperation.registerNewClient();
        OperationInterface.showCreateAccountMenu();
        chooseAccountCreation(bank, client);
    } else if(choice ==0) {
        System.exit(0);
    } else {
        System.out.println("Invalid input!");
        System.out.println("Please, select a valid option.");
    }
}

    public static void chooseBankOption(Bank bank, Client client) {
        OperationInterface.showBankMenu();
        int choice = input.nextInt();
        if (choice == 1 || choice == 2) {
            OperationInterface.showAccountMenu();
            AccountOperation.chooseAccountOption(bank, client);
        } else if (choice == 0) {
            System.exit(0);
        } else {
            System.out.println("Invalid input!");
            System.out.println("Please, select a valid option.");
        }
    }

    public static void chooseAccountCreation(Bank bank, Client client) {
        int choice = input.nextInt();
        if (choice == 1) {
            bank.setAccounts(AccountOperation.createCheckingAccount(client));
            System.out.println("Checking Account successfully created");
        } else if (choice == 2) {
            bank.setAccounts(AccountOperation.createSavingsAccount(client));
            System.out.println("Checking Account successfully created");
        } else if (choice == 0) {
            System.exit(0);
        } else {
            System.out.println("Invalid input!");
            System.out.println("Please, select a valid option.");
        }
    }
}
