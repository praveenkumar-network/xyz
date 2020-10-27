package xyz;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.money.MonetaryAmount;

public class Java8Map {

	public static void main(String[] args) {
		List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30, new BigDecimal(10000),"rathode",2.2),
                new Staff("jack", 20, new BigDecimal(20000),"singh",2.3),
                new Staff("lawrence", 10, new BigDecimal(30000),"kumar",2.4)
        );
		
		int staff1=staff.stream()
				.map(Staff :: getAge)
				.map(MonetorySupport:: mapToMonetaryAmount)
				.reduce(0,Integer ::sum);
		System.out.println(staff1);
	}

}
