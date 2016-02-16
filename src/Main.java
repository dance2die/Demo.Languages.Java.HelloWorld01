import Extend.*;
import anonymous.Speaker;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        for (String arg : args) {
//            out.println(arg);
//        }
//        testSavingsAccount();
//        testVargs();
//        testStaticBlock();
//        testInheritance();
//        testCloneable();
//        testAnoymousClass();

        testAssert1();

    }

    private static void testAssert1() {
        int x = 0;
        assert x == 1 : "X must be 1!!!";
    }

    private static void testAnoymousClass() {
        new Speaker(){
            String message = "This is inside an anoymous class";

            @Override
            public void speak(){
                out.println("message = " + message);
            }
        }.speak();
    }

    private static void testCloneable() throws CloneNotSupportedException {
        Person p1 = new Person("First", "Last");
        Person p2 = (Person) p1.clone();
        out.println(p1 == p2);
        out.println(p1.getFirstName() == p2.getFirstName());
    }

    private static void testInheritance() {
        Employee e1 = new Employee("Michael", "Reddy", 222);
        Employee e2 = new Employee("James", "Dean", 333);
        Employee e3 = new Employee("Calvin", "Klein", 444);

        printEmployee(e1);
        printEmployee(e2);
        printEmployee(e3);
    }

    private static void printEmployee(Employee employee) {
        out.println(String.format("First Name: %s, Last Name: %s, ID: %d",
                employee.getFirstName(), employee.getLastName(), employee.getId()));
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
