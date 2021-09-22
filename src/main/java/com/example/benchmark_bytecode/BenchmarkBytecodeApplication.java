package com.example.benchmark_bytecode;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class BenchmarkBytecodeApplication {

    public static void main(String[] args) throws RunnerException {

        Options opt = new OptionsBuilder()
                .include(BenchMark.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
        //SpringApplication.run(BenchmarkBytecodeApplication.class, args);
    }

}
