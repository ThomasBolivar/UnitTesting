import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void deposit() {
    BankAccount bankAccount = new BankAccount("Thomas","Bolivar",1000.00);
    double balance = bankAccount.deposit(150);
    assertEquals(1150,balance,0);

    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        fail("This test is not yet implemented");
    }

    @org.junit.jupiter.api.Test
    void getBalance() {
        fail("This test is not yet implemented");
    }


}