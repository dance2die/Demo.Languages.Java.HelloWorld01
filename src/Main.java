import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
//        for (String arg : args) {
//            out.println(arg);
//        }

        SavingsAccount savingsAccount = new SavingsAccount(100);
        savingsAccount.printBalance();
        savingsAccount.deposit(200).printBalance();
        savingsAccount.deposit(300).printBalance();
    }
}
