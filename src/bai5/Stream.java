package bai5;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String []args) {
	List<Integer> listNumber = new ArrayList<Integer>();
	for(int i=1;i<1000;i++)
	{
		listNumber.add(i);
	}
	List<Integer> numbers = Arrays.asList(1,5,10,25,14,7,-5);
	
	IntSummaryStatistics stats = numbers.stream().mapToInt((x)->x).summaryStatistics();
	System.out.println(stats.getMax());
	IntSummaryStatistics stats1 = listNumber.stream().mapToInt((x)->x).summaryStatistics();
	System.out.println(stats1.getSum());
	
	
	int sum = listNumber.stream().reduce(0, (a, b) -> a + b);
	System.out.println("Sum of all list: " + sum);
	
	List<String> string = Arrays.asList("tla123","45tla6","tl1a23","t1la23","t12la3","123tla");
	List<String> listSring = string.stream().filter(string.contains("tla")).collect(Collectors.toList());
	System.out.println(listSring);
	
	
	}
}
