package entities;

import exceptions.BusinessException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double wothdrawLimit, double balance) {
        this.number = number;
        this.holder = holder;
        this.withdrawLimit = wothdrawLimit;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        amount += balance;
    }

    public void withdraw(double amount){
        validWithdraw(amount);
        amount -= balance;
    }

    private void validWithdraw(double amount){
        if (amount > getBalance()) {
            throw new BusinessException("Insufficient balance");
        }

        if (amount > getWithdrawLimit()){
            throw new BusinessException("The amount exceeds the withdraw limit");
        }

        if (amount <= 0) {
            throw new BusinessException("The amount must be positive");
        }
    }

    @Override
    public String toString() {
        return "number: " + number +
                "\nholder: " + holder +
                "\nbalance: $" + balance +
                "\nwithdraw Limit: $" + withdrawLimit;
    }
}
