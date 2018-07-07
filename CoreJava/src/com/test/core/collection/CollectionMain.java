package com.test.core.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1st Git Change...");
		System.out.println("2nd Git Change...");
		System.out.println("3rd Git Change...");
		CollectionList cl = new CollectionList();
		cl.perfOfArrayList();
		cl.perfOfLinkedList();
	}

}

class CollectionList{
	
	List<String> al = new ArrayList<String>();
	List<String> ll = new LinkedList<String>();
	void perfOfArrayList(){
		long startTime = System.currentTimeMillis();
		for(int i=0;i<2145007;i++) {
			al.add(String.valueOf(i));
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time Taken for ArrayList::"+(endTime-startTime)+" milli seconds..");
	}
	
	void perfOfLinkedList(){
		long startTime = System.currentTimeMillis();
		for(int i=0;i<2145007;i++) {
			ll.add(String.valueOf(i));
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time Taken for LinkedList::"+(endTime-startTime)+" milli seconds..");
		
	}

}
