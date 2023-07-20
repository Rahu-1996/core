package com.rays.collectionframework;

public class HashCode {
	
	private int id=0;
	private String name=null;
	

	
	public HashCode(int id, String name) {
	 this.id=id;
	 this.name=name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName(String string) {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name;
	
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof HashCode)) {
			
			return false;
		}
		HashCode h=(HashCode)obj;
		boolean b=this.id==h.id && this.name==h.name;
		
		return b;
	}
	@Override
	public int hashCode() {
	 String str=this.id+this.name;
	 
		return str.hashCode();
	}

}
