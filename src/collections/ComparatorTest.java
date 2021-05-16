package collections;

import java.util.*;

public class ComparatorTest {

	public static void main(String[] args) {
		List<Author1> list = new ArrayList<Author1>();
		list.add(new Author1("Dave", "Smith", 29));
		list.add(new Author1("Amy", "Jacson", 35));
		list.add(new Author1("Dave", "John", 43));
		
		Collections.sort(list);
		for(Author1 a : list) {
			System.out.println(a.firstName + " " + a.lastName + ", " + a.age);
		}
		System.out.println();
		
		Collections.sort(list, new authorAge());
		for(Author1 a : list) {
			System.out.println(a.firstName + " " + a.lastName + ", " + a.age);
		}
	}

}

class Author1 implements Comparable<Author1> {
	String firstName;
	String lastName;
	int age;
	
	Author1(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	@Override
	public int compareTo(Author1 au) {
		return this.firstName.compareTo(au.firstName);
	}
}

class authorAge implements Comparator<Author1> {
	@Override
	public int compare(Author1 au1, Author1 au2) {
		return au1.age > au2.age ? 1 : au1.age < au2.age ? -1 : 0;
	}

}
