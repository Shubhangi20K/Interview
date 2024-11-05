package com.assesments;

import java.lang.StackWalker.Option;
import java.util.Optional;

public final class OptionalClass {

	public static void main(String[] args) {
		
String str = null;

Optional<String> optional =Optional.of(str);
System.out.println(optional);

Optional<String> optional1 =Optional.ofNullable(str);
System.out.println(optional1.orElseThrow());


	}
}
