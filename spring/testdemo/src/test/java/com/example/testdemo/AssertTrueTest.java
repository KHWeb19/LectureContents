package com.example.testdemo;

import com.example.testdemo.test.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTrueTest {

    private Account account;

    @BeforeEach
    public void create () {
        account = new Account(10000);
    }

    @Test
    public void isPositiveTest () {
        account.deposit(5000);

        assertTrue(account.hasPositiveBalance());
    }

    @Test
    public void checkIncreaseTest () {
        int initMoney = account.getBalanceMoney();

        account.deposit(5000);

        assertTrue(account.getBalanceMoney() > initMoney);
    }
}
