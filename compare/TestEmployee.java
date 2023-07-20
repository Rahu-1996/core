package com.rays.compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import comparator.StudentCompareTo;



public class TestEmployee {
	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		list.add(new Employee(6,"hari","goa"));
		list.add(new Employee(5,"ram","piplya"));
		list.add(new Employee(4,"abs","delhi"));
		list.add(new Employee(3,"sher","sanawad"));
		list.add(new Employee(2,"ahari","indore"));
		list.add(new Employee(1,"shree","puna"));
		
		
		Collections.sort(list,new orderByName());

		
		
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());


		}
	}
	}


