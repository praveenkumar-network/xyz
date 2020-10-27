package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NestedListTOList {

	public static void main(String[] args) {

		List<List<String>> nestedList=new ArrayList<List<String>>();
		List<String> list=new ArrayList<>();
		list.add("a");
		list.add("d");
		list.add("c");
		
		List<String> listTwo=new ArrayList<>();
		listTwo.add("q");
		listTwo.add("w");
		listTwo.add("e");
		
		nestedList.add(list);
		nestedList.add(listTwo);
		
		List<String> result=nestedList.stream().flatMap(o->o.stream())
		.collect(Collectors.toList());
		
		result.forEach(o->System.out.println(o));
	}

}
