package com.example.testdemo.test;

import lombok.Getter;

@Getter
public class Account {
    private int balanceMoney;

    public Account (int money) {
        this.balanceMoney = money;
    }

    public void deposit (int depositMoney) {
        balanceMoney += depositMoney;
    }

    public void withdraw (int withdrawMoney) {
        balanceMoney -= withdrawMoney;
    }

    public boolean hasPositiveBalance () {
        return balanceMoney > 0;
    }
}
