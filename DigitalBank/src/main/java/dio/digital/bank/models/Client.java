package dio.digital.bank.models;

public class Client {
    private String name;
    private final String socialSecurityNumber; //CPF;

    public Client(String name, String socialSecurityNumber) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return this.name;
    }
    public String getSocialSecurityNumber(){return this.socialSecurityNumber;}
}
