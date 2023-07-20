package com.rays.collectionframework;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedInterface {


	private static final String set = null;

	public static void main(String[] args) {
		
		SortedSet s=new TreeSet();
		s.add(5);
		s.add(6);
		s.add(4);
		s.add(7);
		s.add(3);
		s.add(1);
		s.add(2);
		
		for(Object o:s);{
			
			
			System.out.println("TreeSet"+set);
		}
		
		System.out.println("first element="+s.first());
		System.out.println("last element="+s.last());
		System.out.println("headset element="+s.headSet(5));
		System.out.println("subset from 1-8="+s.subSet(1, 7));
		System.out.println("remove="+s.remove(5));
		System.out.println(s.size());
	
			
	}


	}