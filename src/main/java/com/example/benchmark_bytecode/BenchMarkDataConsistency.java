//package com.example.benchmark_bytecode;
//
//import org.openjdk.jmh.annotations.*;
//import sun.misc.Unsafe;
//
//import java.lang.reflect.Field;
//import java.util.Random;
//import java.util.concurrent.TimeUnit;
//
//@Warmup(iterations = 0, time = 1)
//@Fork(1)
//@BenchmarkMode(Mode.AverageTime)
//@OutputTimeUnit(TimeUnit.NANOSECONDS)
//@Measurement(iterations = 1, time = 1)
//@State(Scope.Benchmark)
//public class BenchMarkDataConsistency {
//
//    static Unsafe UNSAFE;
//    int[] a;
//    @Param({"1", "100", "1000", "10000", "1000000"})
//    int size;
//    byte[] bytes;
//    long address;
//
//    @Setup
//    public void setup() throws NoSuchFieldException, IllegalAccessException {
//        bytes = new byte[size];
//        address = 0;
//        Field f = Unsafe.class.getDeclaredField("theUnsafe");
//        f.setAccessible(true);
//        UNSAFE = (Unsafe) f.get(null);
//    }
//
//    @Benchmark
//    public long unsafe() {
//        address = UNSAFE.allocateMemory(size);
//        return address;
//    }
//
//    @Benchmark
//    public long unsafeInitialize() {
//        address = UNSAFE.allocateMemory(size);
//        UNSAFE.setMemory(address, size, (byte) 0);
//        return address;
//    }
//
//    @Benchmark
//    public long safe() {
//        byte[] a = new byte[size];
//        address = 0;
//        return address;
//    }
//}
