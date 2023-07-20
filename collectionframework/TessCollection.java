package com.rays.collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class TessCollection {

	   public static void main(String[] args) {
		   Collection c1=new ArrayList();
		   c1.add(200);
		   c1.add("two");
		   c1.add(true);
		
		   
		   Collection c2=new ArrayList();
		   c2.add("hii");
		   c2.add("hello");
		   c2.add("name");
		   
		   
		  // c2.addAll(c1);
		 // System.out.println(c2);
		   System.out.println(c1.contains("hii"));
		   //System.out.println(c2.containsAll(c2));
		   //System.out.println(c2.isEmpty());
		  // System.out.println(c2.remove("hii"));
		  // System.out.println(c1.removeAll(c1));
		  // System.out.println(c1.retainAll(c2));
		   //System.out.println(c2.size());
		 //  c1.clear();
		// System.out.println(c1);

	}
}
