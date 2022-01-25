package com.example.demo.utility.thread;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWorker extends Thread {
    private static int test;

    private static Lock lock;

    public ThreadWorker () {
        ThreadWorker.test = 0;
        lock = new ReentrantLock();
    }

    // 값을 갱신(write)하는 구조가 아니므로 Lock이 필요 없음
    public static int getSyncLockTest () {
        int tmp;

        //lock.lock();
        tmp = ThreadWorker.test;
        //lock.unlock();

        return tmp;
    }

    @SneakyThrows
    @Override
    public void run() {
        for (;;) {
            try {
                lock.lock();

                ThreadWorker.test += 1;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

            Thread.sleep(3000);
        }
    }
}
