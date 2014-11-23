package de.hawhamburg.java8.benchmark;

import de.hawhamburg.java8.helper.RandomNumberArrays;
import org.openjdk.jmh.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 10)
@Measurement(iterations = 20)
@Fork(1)
@State(Scope.Benchmark)
public class BenchmarkForEach {

    @Param({ "1", "100", "10000", "1000000"})
    private int size;

    private List<Integer> testTarget;

   @Setup
    public void init(){
       testTarget = RandomNumberArrays.generateArrayAtGivenSize(size);
   }

    @Benchmark
    public void forEach_Stream(){;
        testTarget.forEach(x -> { final boolean someStuff = true;});
    }

    @Benchmark
    public void forEach_Old(){
        for(Integer number : testTarget){
            final boolean someStuff = true;
        }
    }

}
