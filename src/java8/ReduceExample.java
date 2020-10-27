package java8;

import java.util.ArrayList;
import java.util.List;

public class ReduceExample {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(2);
		list.add(3);
		list.add(4);
		int sum=list.stream().reduce(0,(a,b)->a+b);
		int average=list.stream().reduce(1,(a,b)->(a+b)/2);
		int multiplication=list.stream().reduce(1,(a,b)->a*b);
		int min=list.stream().reduce(3,(a,b)->a<b?a:b);
		int max=list.stream().reduce(0,(a,b)->a>b?a:b);
		System.out.println(sum+" "+average+" "+multiplication+" "+min+" "+max);
	}
}
