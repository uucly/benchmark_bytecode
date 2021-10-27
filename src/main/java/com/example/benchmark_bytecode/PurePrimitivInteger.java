package com.example.benchmark_bytecode;

public final class PurePrimitivInteger {

    public int primitivInteger() {
        Integer A = Integer.valueOf(100);
        Integer B = Integer.valueOf(100);

        return A + B;
    }
}
