package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerClass {

	public static void main(String[] args) {
		List<String> list =Arrays.asList("a","b","c");
		Consumer<String> consumer=new Consumer<String>() {
			@Override
			public void accept(String str) {
				System.out.print(str);
				System.out.print(" ");
			}
		};
		
		Consumer<String> consumerLamda=(String str)-> {
				System.out.print(str);
				System.out.print(" ");};
				
			
		System.out.println("Consumer without lamda");
		list.forEach(consumer);
		
		System.out.println(" ");
		System.out.println("Consumer with lamda");
		list.forEach(consumerLamda);
		
	}

}
