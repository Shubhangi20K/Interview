package com.nt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomArrayList extends ArrayList{
	
	
	@Override
	public boolean add(Object o)
	{
		if(this.contains(o))
		{
		return true;
		
	}
		else
		{
			return super.add(o);
		}
	}
	public static void main(String[] args) {
		
		CustomArrayList li=  new CustomArrayList();
		li.add(1);
		li.add(1);
		li.add(2);
		System.out.println(li);
		
		Set<String> set= new HashSet();
		set.add("abc");
			
		}
		
	}

