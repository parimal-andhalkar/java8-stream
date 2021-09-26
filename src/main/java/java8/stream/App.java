package java8.stream;

import java.util.IntSummaryStatistics;
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

    }
}
