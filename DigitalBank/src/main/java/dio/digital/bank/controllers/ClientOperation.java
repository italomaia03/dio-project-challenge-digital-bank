package dio.digital.bank.controllers;

import dio.digital.bank.models.*;

import java.util.Scanner;
import java.util.stream.Collectors;


public class ClientOperation {
    static Scanner input = new Scanner(System.in);

    public static boolean checkClientRegistration(Bank bank, Client client){
        return bank.getAccounts().stream().anyMatch(account -> account.getClient().getSocialSecurityNumber().equals(client.getSocialSecurityNumber()));
    }
    public static Client registerNewClient(){
        System.out.println("Inform your name: ");
        System.out.print("Name: ");
        String name = new Scanner(System.in).next();
        System.out.println("Inform your Social Security Number: ");
        System.out.print("Social Security Number: ");
        String ssn = new Scanner(System.in).next();
        return new Client(name, ssn);
    }

    public static Client logInClient(Bank bank){
        System.out.println("Inform your Social Security Number");
        System.out.print("Social Security Number: ");
        String ssn = input.next();
        return findClient(bank, ssn);
    }

    public static Client findClient(Bank bank, String ssn){
        return bank.getAccounts().stream().filter(account -> account.getClient().getSocialSecurityNumber().equals(ssn)).collect(Collectors.toList()).get(0).getClient();
    }
}

