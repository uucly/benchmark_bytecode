//package com.example.benchmark_bytecode;
//
//import org.openjdk.jmh.annotations.*;
//
//import java.util.Random;
//import java.util.concurrent.TimeUnit;
//
//@Warmup(iterations = 3, time = 1)
//@Fork(1)
//@BenchmarkMode(Mode.AverageTime)
//@OutputTimeUnit(TimeUnit.NANOSECONDS)
//@Measurement(iterations = 1, time = 1)
//@State(Scope.Benchmark)
//public class BenchMarkArray {
//
//    public final static Random r = new Random(7L);
//
//    @Benchmark
//    public int array64() {
//        int[] a = new int[64];
//        a[0] = r.nextInt();
//        a[1] = r.nextInt();
//
//        return a[0] + a[1];
//    }
//
//    // -XX:EliminateAllocationArraySizeLimit=70
//    @Benchmark
//    public int array65() {
//        int[] a = new int[65];
//        a[0] = r.nextInt();
//        a[1] = r.nextInt();
//
//        return a[0] + a[1];
//    }
//
//    @Benchmark
//    public int[] array64Return() {
//        int[] a = new int[64];
//        a[0] = r.nextInt();
//        a[1] = r.nextInt();
//
//        return a;
//    }
//}
