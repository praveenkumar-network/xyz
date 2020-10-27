package java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSort {

	public static void main(String[] args) {

		Map<String,Integer> map=new HashMap<>();
		map.put("a", 10);
		map.put("c", 7);
		map.put("d", 8);
		map.put("b", 9);
		System.out.println("Short by key");
		Map<String,Integer>result=map.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue ,(oldValue,newValue)->newValue ,LinkedHashMap::new));
		
		result.forEach((k,v)->System.out.println(k+" "+v));
		
		System.out.println("Short by value");
		Map<String,Integer>shortByValue=map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue ,(oldValue,newValue)->newValue ,LinkedHashMap::new));
				
		shortByValue.forEach((k,v)->System.out.println(k+" "+v));
	}

}
