package collection_framework;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		Random random = new Random();
		for (int i = 1; i <= 5; i++) {
			arrayList.add(new Integer(random.nextInt(100)));
		}
		System.out.println("Elements are : ");
		for (int i : arrayList) {
			System.out.println(i);
		}
		
		ArrayList al = new ArrayList(); 
		  for(int i=10 ; i<=30 ; i+=10) 
		{ 
		   al.add(new Integer(i));  
		   al.add(new Integer(2)); 
		  } 
		  System.out.println(al); 
		  al.remove(new Integer(2)); //deletes first occurance of 2 
		  System.out.println(al); 
	}
}
