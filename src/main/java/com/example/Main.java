package com.example;

import java.io.File;
import java.util.concurrent.locks.Lock;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public void doSomething(File file, Lock lock) {
        file.delete();  // Noncompliant
        // ...
        lock.tryLock(); // Noncompliant

        System.out.println("Hello world!");
    }
}