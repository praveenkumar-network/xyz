package java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {

		Comparator<Developer> comparator=new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				 return o1.getName().compareToIgnoreCase(o2.getName());
			}
		};
		
		Comparator<Developer> comparatorLamda=(Developer o1, Developer o2)-> {
				 return o1.getAge()-o2.getAge();
			};
		
		
		List<Developer> list=new ArrayList<Developer>();
		list.add(new Developer("a",new BigDecimal(123),12));
		list.add(new Developer("z",new BigDecimal(124),9));
		list.add(new Developer("f",new BigDecimal(125),8));
		list.add(new Developer("c",new BigDecimal(126),6));
		
		System.out.println("Without Lambda");
		list.sort(comparator.reversed());
		for(Developer d:list) {
			System.out.println(d.getName() +" " +d.getSalary()+" "+d.getAge());
		}

		System.out.println("With Lambda");
		list.sort(comparatorLamda.reversed());
		list.forEach(o->{
			System.out.println(o.getName()+" "+o.getSalary()+" "+o.getAge());
		});
	}

}
