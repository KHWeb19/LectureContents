package com.example.testdemo;

import com.example.testdemo.test.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class AssertFalseTest {

    private Account account;

    @BeforeEach
    public void create () {
        account = new Account(10000);
    }

    @Test
    public void isNegativeTest () {
        account.withdraw(50000);

        assertFalse(account.hasPositiveBalance());
    }

    @Test
    public void checkDecreaseTest () {
        int initMoney = account.getBalanceMoney();

        account.withdraw(50000);

        assertFalse(account.getBalanceMoney() > initMoney);
    }
}
