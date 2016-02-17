import Extend.*;
import anonymous.Speaker;
import annotations.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args)
            throws CloneNotSupportedException, ClassNotFoundException {
//        for (String arg : args) {
//            out.println(arg);
//        }
//        testSavingsAccount();
//        testVargs();
//        testStaticBlock();
//        testInheritance();
//        testCloneable();
//        testAnoymousClass();
//        testAssert1();
//        testProcessingAnnotation();
//        testGenerics();
        testEnums();


    }

    enum Coin {PENNY, NICKEL, DIME, QUARTER}

    private static void testEnums() {
        Coin coin = Coin.NICKEL;
        switch (coin){
            case PENNY: out.println("1 cent"); break;
            case NICKEL: out.println("5 cents"); break;
            case DIME: out.println("10 cents"); break;
            case QUARTER: out.println("25 cents"); break;
            default: assert false;
        }
    }

    private static void testGenerics() {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("F1", "L1", 1));
        employees.add(new Employee("F2", "L2", 2));
        employees.add(new Employee("F3", "L3", 3));

        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            out.println(employee.getName());
        }
    }

    private static void testProcessingAnnotation() throws ClassNotFoundException {
        Method[] methods = Class.forName("Extend.Employee").getMethods();
        for (int i = 0; i< methods.length; i++){
            if (methods[i].isAnnotationPresent(Stub.class)){
                Stub stub = methods[i].getAnnotation(Stub.class);
                int id = stub.id();
                String date = stub.dueDate();
                String developer = stub.developer();
                out.println("Stub ID = " + id);
                out.println("Stub date = " + date);
                out.println("Stub developer = " + developer);
            }
        }
    }

    @Deprecated
    private static void testAssert1() {
        int x = 0;
//        assert x == 1 : "X must be 1!!!";
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
