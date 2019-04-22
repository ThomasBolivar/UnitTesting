import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void deposit() {
    BankAccount bankAccount = new BankAccount("Thomas","Bolivar",1000.00);
    double balance = bankAccount.deposit(150);
    assertEquals(1150,balance);

    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        BankAccount bankAccount = new BankAccount("Thomas"," Bolivar",1000);
        double balance = bankAccount.withdraw(150);
        assertEquals(850,balance);
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        BankAccount bankAccount = new BankAccount("Thomas","Bolivar",1000.00);
        bankAccount.deposit(150);
        assertEquals(1150,bankAccount.getBalance());
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        BankAccount bankAccount = new BankAccount("Thomas","Bolivar",1000.00);
        bankAccount.withdraw(150);
        assertEquals(850,bankAccount.getBalance());
    }
}