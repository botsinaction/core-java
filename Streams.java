package features.java8;

import java.util.Arrays;

public class Streams {
	public static void main(String[] args) {
//		IntStream
//			.range(1, 10)
//			.skip(5) //skip first 5 elements and print till <10.
//			.forEach(x -> System.out.println(x));
		
//		Stream.of("prem", "raj", "als")
//			.sorted()
//			.findFirst()
//			.ifPresent(System.out::print);

//		String[] names = {"as", "sa", "ds", "ser", "gf"};
//		Arrays.stream(names)  //or Stream.of(names)
//			.filter(val -> val.startsWith("s"))
//			.sorted()
//			.forEach(res -> System.out.println(res));
		
//		Arrays.stream(new int[] {2, 3, 4, 5, 6})
//			.map(x->x*x)
//			.average()
//			.ifPresent(System.out::println);
		
//		String[] names = {"as", "sa", "ds", "ser", "gf"};
//		Stream.of(names)
//			.filter(x -> x.length() == 3)
//			.forEach(System.out::println);

		//collect in a map - we can similarly collect in a set, list etc..
//		String[] names = {"as", "sad", "sd", "ser", "gf"};
//		Map<String, Integer> map = new HashMap<>();
//		map = Stream.of(names)
//				.filter(x->x.startsWith("s"))				
//				.collect(Collectors.toMap(
//						x -> x, x -> x.length()));
//		System.out.println(map);
		
		//reduce
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// 1st argument, init value = 0
		int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
		System.out.println("sum : " + sum); // 55
		
		//or
		
		int sum1 = Arrays.stream(numbers).reduce(0, Integer::sum); // 55
		
		//max-min using reduce
		int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int max = Arrays.stream(numbers1).reduce(0, (a, b) -> a > b ? a : b);  // 10
		int max1 = Arrays.stream(numbers1).reduce(0, Integer::max);            // 10

		int min = Arrays.stream(numbers1).reduce(0, (a, b) -> a < b ? a : b);  // 0
		int min1 = Arrays.stream(numbers1).reduce(0, Integer::min);            // 0
		
				
	}
}
