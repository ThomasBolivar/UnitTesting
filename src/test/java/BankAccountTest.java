import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {


    /*
    *if we want to work with an array for example and write some test for it, we should use assertArrayEquals(),
    *assertEquals() wont work.
    *Method assertArrayEquals considers what the testing array have the same lengths and an elements the same as well.
    *   just a quick not for myself :)
     */

    private BankAccount bankAccount;
    private static int count;
    /*
    * BeforeEach annotation tells the JUNIT that method void setup should be called for every test.
    * This method and BeforeAll renamed in Junit 5, version 4 have this annotations with different names: Before - for BeforeEach
    * and BeforeAll for BeforeClass
    *
    * */
    @org.junit.jupiter.api.BeforeAll
    static void firstToRun() {
        System.out.println("Im running the first, before all test is coming, im running even before @BeforeEach, i can be used " +
                "to open socket for example or for LOG. and @AfterAll can help to close connection for example :)" +
                " Oh, and i should be static. \nI was executed, so count is incremented  " + count++ + " times");

    }
    @org.junit.jupiter.api.BeforeEach
    void setup() {
         bankAccount = new BankAccount("Thomas","Bolivar",1000.00);
        System.out.println("I was executed, so count is incremented  " + count++ + " times");

    }
    @org.junit.jupiter.api.Test
    void deposit() {
    double balance = bankAccount.deposit(150);
    assertEquals(1150,balance);

    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        double balance = bankAccount.withdraw(150);
        assertEquals(850,balance);
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        bankAccount.deposit(150);
        assertEquals(1150,bankAccount.getBalance());
        System.out.println("Get balance_deposit is fine ^_^");
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        bankAccount.withdraw(150);
        assertEquals(850,bankAccount.getBalance());
        System.out.println("Get balance_withdraw is fine ^_^");
    }
    @org.junit.jupiter.api.AfterAll
    static void lastToRun() {
        System.out.println("And im the last one" +  "\nI was executed, so count is incremented  " + count++ + " times");
    }
}