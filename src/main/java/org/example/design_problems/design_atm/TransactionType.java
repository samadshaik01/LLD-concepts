package org.example.design_atm;

public enum TransactionType {
    WithDRAW,CHECK_BALANCE;

    public void showAllOptions(){
        for(TransactionType type: TransactionType.values()){
            System.out.println(type.name());
        }
    }
}
