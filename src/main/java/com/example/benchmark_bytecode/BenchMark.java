package com.example.benchmark_bytecode;

import org.openjdk.jmh.annotations.*;

import java.util.Random;

@State(Scope.Benchmark)
public class BenchMark {

//    public final static Random r = new Random(7L);
//    public static int a, b;
//
//    @Setup
//    public void setup() {
//        a = r.nextInt(1000) + 128;
//        b = r.nextInt(1000) + 128;
//    }

    // @Fork(value = 1, warmups = 1)
//    @Warmup(iterations = 1)
//    @Benchmark
//    public int newInteger() {
//        Integer A = new Integer(a);
//        Integer B = new Integer(b);
//
//        return A + B;
//    }

    //    @Fork(value = 1, warmups = 1)
    @Warmup(iterations = 2)
    @Fork(0)
    @Measurement(iterations = 1)
    @Benchmark
    public int integerValueOf() {
        Integer A = Integer.valueOf(10);
        Integer B = Integer.valueOf(20);

        return A + B;
    }
}
