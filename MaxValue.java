upackage com.assesments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxValue {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(11, 2, 3, 4);
		// 1) finding max value
		Integer Result = l1.stream().max(Integer::compare).get();
		System.out.println(Result);

		// 2) finding start with 1
		List<Integer> r1 = l1.stream().filter(i -> i.toString().startsWith("1")).collect(Collectors.toList());
		System.out.println(r1);
		// 3) finding min value
		Integer Result2 = l1.stream().min(Integer::compare).get();
		System.out.println(Result2);

		// 4) finding duplicate value
		List<String> r3 = Arrays.asList("Meta", "Apple", "Amazon", "Netflix", "Meta", "Google", "Apple");
		Set<String> Result3 = r3.stream().filter(i -> Collections.frequency(r3, r3) > 1).collect(Collectors.toSet());
		System.out.println(Result);

		// 5) finding 1 element in the list

		List<Integer> f1 = Arrays.asList(1, 2, 3, 4, 5);
		Integer find = f1.stream().findFirst().get();
		System.out.println(find);

		// 6) find the total no of element

		List<Integer> t1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		long total = t1.stream().count();
		System.out.println(total);

		// 7) find the non- repeated element in the list

		List<Integer> nonRep = Arrays.asList(1, 1, 2, 3, 4, 4);
		List<Integer> nonRepeted = nonRep.stream().distinct().collect(Collectors.toList());
		System.out.println(nonRepeted);

		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 4, 4);
		Set<Integer> duplicatedNumbersRemovedSet = new HashSet<>();
		Set<Integer> duplicatedNumbersSet = numbers.stream().filter(n -> !duplicatedNumbersRemovedSet.add(n))
				.collect(Collectors.toSet());

		// 8)sort the list
		List<Integer> ll1 = Arrays.asList(31, 12, 32);
		List<Integer> res = ll1.stream().sorted().collect(Collectors.toList());
		System.out.println(res);

		// 9)FindFirst number
		List<Integer> find1 = Arrays.asList(4, 2, 3, 3, 4);
		int Resu = find1.stream().distinct().findFirst().get();
		System.out.println(Resu);

		// 10) Repeated element

		List<Integer> numbers1 = Arrays.asList(1, 2, 1, 3, 4, 4);
		Set<Integer> nonduplicatedNumbersRemovedSet = new HashSet<>();
		Set<Integer> nonduplicatedNumbersSet = numbers1.stream().filter(n -> nonduplicatedNumbersRemovedSet.add(n))
				.collect(Collectors.toSet());

		// 11) find the first repeated character in it using Stream functions?
		List<Integer> numbers11 = Arrays.asList(1, 2, 1, 3, 4, 4);
		Set<Integer> nonduplicatedNumbersRemovedSet1 = new HashSet<>();
		Optional<Integer> nonduplicatedNumbersSet1 = numbers11.stream().findFirst()
				.filter(n -> nonduplicatedNumbersRemovedSet.add(n));

		// 12)sort all the vales present in it using Stream functions?

		List<Integer> sort = Arrays.asList(100, 99, 98, 97);
		List<Integer> ResultSort = sort.stream().sorted().collect(Collectors.toList());
		System.out.println(ResultSort);

		// 13)sort all the values present in it in order using Stream functions?

		List<String> re1 = Arrays.asList("a", "c", "b");
		List<String> res1 = re1.stream().sorted().collect(Collectors.toList());
		System.out.println(res1);

		// 14)Java 8 program to concatenate two Streams?descending

		List<List<String>> s1 = Arrays.asList(Arrays.asList("a", "b", "c"), Arrays.asList("d", "e", "f"));
		List<String> contcat1 = s1.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
		System.out.println(contcat1);

		// 15)Java 8 program to find the number of Strings in a list whose length is
		// greater than 5?
		List<Integer> number = new ArrayList<>(Arrays.asList(2, 8, 3, 10, 6, 4));
		long count = number.stream().max(Integer::compare).get();
		System.out.println(count);

		// 16 ) How can we achieve joining multiple Strings using StringJoiner Class?
		StringJoiner string = new StringJoiner(",");
		string.add("shubhangi");
		string.add("kurelay");
		System.out.println(string);

		// 17)Q14)Find the Word/number got repeated by using Stream api
		Integer[] numberss = { 2, 3, 34, 5, 5, 4, 3, 3, 3 };
		Map<Integer, Long> frequencyMap = Arrays.stream(numberss)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		frequencyMap.forEach((key, value) -> System.out.println(key + "-" + value));

		// 18)Given a list of Strings .sConvert String to uppercase and Join them with
		// coma (,) using Stream api
		String[] s6 = { "USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada" };
		List<String> f = Stream.of(s6).filter(i -> i.toUpperCase().contains(",")).collect(Collectors.toList());
		System.out.println(f);

		// 19
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 5, 8, 10, 11, 11, 12));
		// 12 11 11 10 8 5 1
		list.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);

		List<Integer> li = Arrays.asList(1, 2, 50, 30, 4);
		List<Integer> rs = li.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(rs);
		List<Integer> rs1 = li.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).collect(Collectors.toList());
		System.out.println(rs1);

		// Integer[] numbers34 = {2, 3, 34, 5, 5, 4, 3, 3, 3};

		List<Integer> lq = Arrays.asList(2, 3, 4, 5, 5);
		List<Integer> rss = lq.stream().distinct().collect(Collectors.toList());
		System.out.println(rss);
		Integer lq4 = lq.stream().distinct().sorted(Comparator.comparing(Integer::intValue)).skip(1).findFirst().get();
		System.out.println(lq4);

		Map<String, List<String>> list4 = new HashMap<String, List<String>>();
		list4.put("shubhangi", Arrays.asList("1234", "345", "4566"));
		list4.put("shubhanshu", Arrays.asList("5555", "7777", "8888"));

		List<String> result = list4.values().stream().flatMap(Collection::stream).distinct()
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(result);

		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 4, 3);
		List<Integer> resa = l.stream().filter(e -> Collections.frequency(l, e) > 1).collect(Collectors.toList());
		System.out.println(resa);

		List<Integer> l11 = Arrays.asList(1, 2, 3, 4, 5, 4, 3);
		
		List<Integer> resss = l11.stream().distinct().collect(Collectors.toList());
		System.out.println(resss);

		IntStream.range(10, 21).filter(n -> n % 1 == 0).forEach(System.out::println);
		
		String input = "Shubhangi is a good girl";
		/*
		 * String longestWord = Arrays.stream(input.split("\\s+"))
		 * .max(Comparator.comparingInt(String::length)).get(); //.orElse(null);
		 */
		String res=		Arrays.stream(input.split("\\s+")).max(Comparator.comparingInt(String::length)).get();
		//System.out.println(longestWord);
		System.out.println(res);
		
		
	}

}
