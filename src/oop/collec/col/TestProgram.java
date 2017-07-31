package oop.collec.col;

import java.util.ArrayList;

public class TestProgram {
	
	public static void main(String[] args) {
		//GenericList<Integer> list = new GenericList<integer>();
		GenericList<Integer> list = new GenericList<Integer>();
		
		list.add(3);
		//list.add("hello");
		//list.add(4.5f);
		//list.add(new Exam());
		

		for(int i =0; i<list.size(); i++)
			System.out.println(list.get(i));
		
		while(list.hasNext())
			System.out.println(list.next());
	}
}

