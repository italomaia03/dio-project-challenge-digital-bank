package dio.digital.bank;

public class Account {

    private static final int DEFAULT_AGENCY = 0001;
    private static int SEQUENTIAL = 1;
    protected double balance;
    protected int accNumber, agency;
    protected Client client;

    public Account(Client client){
        this.client = client;
        this.agency = DEFAULT_AGENCY;
        this.accNumber = SEQUENTIAL++;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public int getAgency() {
        return agency;
    }

    public Client getClient() {
        return client;
    }

    public void withdraw(double value){
        this.balance -= value;
    }

    public void printStatement(){
        System.out.println(String.format("Client: %s",this.client.getName()));
        System.out.println(String.format("Agency: $d",this.agency));
        System.out.println(String.format("Account Number: $%d",this.accNumber));
        System.out.println(String.format("Balance: $%.2f",this.balance));
    }

    public void deposit(double value){
        this.balance += value;
    }

    public void transfer(Account account, double value){
        withdraw(value);
        account.deposit(value);
    }

}
