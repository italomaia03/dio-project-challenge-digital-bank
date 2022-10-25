package dio.digital.bank.views;


public class OperationInterface {

    public static void accessMenu(){
        System.out.println("=".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("\tChoose what you want to do\t");
        System.out.println("1 - Already a client");
        System.out.println("2 - New client");
        System.out.println("0 - Exit");
        System.out.println("*".repeat(30));
        System.out.println("=".repeat(30));
        System.out.print("Option: ");
    }

    public static void showAccountMenu(){
//        System.out.println("\n".repeat(100));
        System.out.println("=".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("\tChoose what you want to do\t");
        System.out.println("1 - Print account statement");
        System.out.println("2 - Withdraw");
        System.out.println("3 - Deposit");
        System.out.println("4 - Transfer");
        System.out.println("0 - Exit");
        System.out.println("*".repeat(30));
        System.out.println("=".repeat(30));
        System.out.print("Option: ");
    }

    public static void showBankMenu(){
//        System.out.println("\n".repeat(100));
        System.out.println("=".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("\tChoose what you want to do\t");
        System.out.println("1 - Checking Account");
        System.out.println("2 - Savings Account");
        System.out.println("0 - Exit");
        System.out.println("*".repeat(30));
        System.out.println("=".repeat(30));
        System.out.print("Option: ");
    }

    public static void showCreateAccountMenu(){
//        System.out.println("\n".repeat(100));
        System.out.println("=".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("Choose what type of account you want:");
        System.out.println("1 - Checking Account");
        System.out.println("2 - Savings Account");
        System.out.println("0 - Exit");
        System.out.println("*".repeat(30));
        System.out.println("=".repeat(30));
        System.out.print("Option: ");
    }

}
