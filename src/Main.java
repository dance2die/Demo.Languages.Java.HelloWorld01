public class Main {
    public static void main(String[] args) {
//        for (String arg : args) {
//            out.println(arg);
//        }
//        testSavingsAccount();
//        testVargs();

        testStaticBlock();
    }

    private static void testStaticBlock() {
        StaticClass staticClass = new StaticClass();

    }

    private static void testVargs() {
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,30,40));
        System.out.println(sum(10,200,300));
    }

    private static double sum(double... values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }

        return sum;
    }

    private static void testSavingsAccount() {
        SavingsAccount savingsAccount = new SavingsAccount(100);
        savingsAccount.printBalance();
        savingsAccount.deposit(200).printBalance();
        savingsAccount.deposit(300).printBalance();
    }
}
