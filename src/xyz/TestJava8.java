package xyz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestJava8 {

    public static void main(String[] args) {



		/*
		 * List<Integer> num = Arrays.asList(1,2,3,4,5); List<Integer> collect1 = num
		 * .stream() .map(n -> method(n)) .collect(Collectors.toList());
		 * System.out.println(collect1);
		 */
        
        
        List<String> alpha = Arrays.asList();

        // Java 8
        List<String> collect = alpha
        		.stream()
        		.filter(Objects::nonNull)
        		.map(x->method(x))
        		.collect(Collectors.toList());
        System.out.println(collect); //[A, B, C, D]

    }
    public static int method(int n) {
    	System.out.println("Hi");
    	return n*2;
    }
    public static String method(String x) {
    	System.out.println(x);
    	return x.toUpperCase();
    }

}