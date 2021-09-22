package com.example.benchmark_bytecode;

public class NewInteger {

    public int newInteger() {
        Integer A = new Integer(100);
        Integer B = new Integer(100);

        return A + B;
    }
}
