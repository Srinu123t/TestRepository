package test.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class AL {
	
	public static void main(String args[]) {
		
		LinkedList<String> arrli = new LinkedList<String>();
		
		arrli.add("test");
		arrli.add("test1");
		arrli.add("test2");
		
		arrli.addFirst("first");
		
		
		for(String obj:arrli) {
			
			System.out.println(arrli.getLast());
		}
		
		
	}
}
