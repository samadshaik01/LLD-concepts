package org.example.design_atm;


public class Demo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("123456789", 1000.0);
        Card card = new Card("123456789", 12345,bankAccount);
        User user = new User("John Doe", bankAccount, card);

        ATM atm = new ATM();
        atm.insertCard(card);
        atm.authenticatePin(1234);
        atm.selectOperation(TransactionType.CHECK_BALANCE);
        atm.selectOperation(TransactionType.WithDRAW);
        atm.exit();
    }
}
