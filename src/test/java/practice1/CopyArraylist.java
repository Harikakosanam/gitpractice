package practice1;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArraylist {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		
		al.add("A");
		al.add("b");
		al.add("c");
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("A");
		al1.add("hai");
		al1.add("hello");
		System.out.println("array list elements"+al);
		Collections.copy(al1, al1);
		System.out.println("copy elements in arraylist"+al1);
		
		
		
	}

}
