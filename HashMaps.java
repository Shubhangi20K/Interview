package com.assesments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMaps {
public static void main(String[] args) {
	
HashMap<Integer, String> map = new HashMap();
map.put(1, null);
map.put(null, null);
System.out.println("itrating the map");
for(Map.Entry m :map.entrySet())
{
	System.out.println(m.getKey()+""+m.getValue());
}
}
}
