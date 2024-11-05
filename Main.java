package com.assesments;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,15,3,10,27);
	int sum = list.stream()
			.filter(i->i%3==0)
			.mapToInt(Integer:: intValue)
			.sum();
	System.out.println(sum);

	}
}
