package org.example.design_patterns.proxy_pattern;

public class Atm implements Account {


    @Override
    public void getAccountNumber() {
        // allowing you to perform something either before or after the request gets through to the original object.(such as user permissions or roles.)
        //Some objects are resource-intensive to create (e.g., large files, database connections, or high-resolution images). You want to delay their creation until they are actually needed.means wherever BAnk onject is getting used you can replace it with AM instead
        Bank bank = new Bank();
        bank.getAccountNumber();
    }

    @Override
    public void withdraw() {
        Bank bank = new Bank();
        bank.withdraw();
    }
}
