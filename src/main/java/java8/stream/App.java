package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int[] numbers = {4,12,7,6,65,43,21,67,32};
        
      IntStream stream = IntStream.of(numbers);
      //System.out.println("Min : " + stream.min());
      System.out.println("avergae : " + stream.average().getAsDouble());
     
      stream.close();
      
      IntSummaryStatistics summaryStatistics = IntStream.of(numbers).summaryStatistics();
      System.out.println("max :"+summaryStatistics.getMax());
      
      				IntStream intStream = Arrays.stream(numbers);
      				long count = intStream.filter(e->e>0).count();
      				
      				System.out.println("Count "+count);
      				
      	List<Integer> intList = new ArrayList<>();
      	intList.add(10);
      	intList.add(-1);
      	intList.add(0);
      	intList.add(11);
      	intList.add(12);
      	intList.add(13);
      	
      	long posCount = intList.stream().filter(e-> e>0).count();
      	System.out.println("Positive Count :"+posCount);
      	
      	Optional<Integer> min = intList.stream().min(Comparator.comparing(Integer::valueOf));
      	System.out.println("Minimun :"+min.get());
      		int sum = intList.stream().mapToInt(Integer::valueOf).sum();
      		System.out.println("Sum :"+sum);
    }
}
