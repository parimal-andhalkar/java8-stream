package java8.stream.mapUtility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapUtility {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(2 ,6 ,3 ,4 ,7 ,2 ,10, 3, 2 ,1);
		System.out.println("Frequency List : .......");
		System.out.println(frquencyMap(list1));
		
		 Map<String, Integer> unsortMap = new HashMap<>();
	        unsortMap.put("z", 10);
	        unsortMap.put("b", 5);
	        unsortMap.put("a", 6);
	        unsortMap.put("c", 20);
	        unsortMap.put("d", 1);
	        unsortMap.put("e", 7);
	        unsortMap.put("y", 8);
	        unsortMap.put("n", 99);
	        unsortMap.put("g", 50);
	        unsortMap.put("m", 2);
	        unsortMap.put("f", 9);
	        
	      System.out.println("Sort By Keys.......");  
	      System.out.println(sortMapByKey(unsortMap));
	      System.out.println("Sort By Keys Reverse Order.......");
	      System.out.println(sortMapByKeyReverseOrder(unsortMap));  
	      System.out.println("Sort By Values.......");
	      System.out.println(sortMapByValue(unsortMap));  
	      System.out.println("Sort By values Reverse Order.......");
	      System.out.println(sortMapByValueReversedOrder(unsortMap));  
	}

	
	public static Map<Integer, Long> frquencyMap(List<Integer> list){
	
		Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		return map;
	}
	
	public static Map<String, Integer> sortMapByKey(Map<String, Integer> map)
	{
		LinkedHashMap<String, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));
		return sortedMap;
	}
	
	
	public static Map<String, Integer> sortMapByKeyReverseOrder(Map<String, Integer> map)
	{
		LinkedHashMap<String, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByKey().reversed())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));
		return sortedMap;
	}
	
	
	public static Map<String, Integer> sortMapByValue(Map<String, Integer> map)
	{
		LinkedHashMap<String, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));
		return sortedMap;
	}
	public static Map<String, Integer> sortMapByValueReversedOrder(Map<String, Integer> map)
	{
		LinkedHashMap<String, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));
		return sortedMap;
	}
	
}
