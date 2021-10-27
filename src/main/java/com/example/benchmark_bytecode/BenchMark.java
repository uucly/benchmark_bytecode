package com.example.benchmark_bytecode;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@Warmup(iterations = 0, time = 1)
@Fork(1)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Measurement(iterations = 1, time = 1)
@State(Scope.Benchmark)
public class BenchMark {

    @Benchmark
    public int simple() {
        int A = 10;
        int B = 10;

        return A + B;
    }

    @Benchmark
    public int valueOf() {
        int A = Integer.valueOf(10);
        int B = Integer.valueOf(10);

        return A + B;
    }

    @Benchmark
    public int newInteger() {
        int A = new Integer(10);
        int B = new Integer(10);

        return A + B;
    }

//    Integer[] integers = new Integer[10000];
//
//    @Benchmark
//    public int newIntegerLoop() {
//
//        for (int i = 0; i < 10000; i++) {
//            integers[i] = new Integer(i);
//        }
//
//        return integers.length;
//    }
//
//    int[] ints = new int[10000];
//
//    @Benchmark
//    public int simpleIntegerLoop() {
//
//        for (int i = 0; i < 10000; i++) {
//            ints[i] = i;
//        }
//
//        return ints.length;
//    }
}
