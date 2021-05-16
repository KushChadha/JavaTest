package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {

	public static void main(String[] args) {
		List<Author> list = new ArrayList<Author>();
		list.add(new Author("Dave", "Smith", 29));
		list.add(new Author("Amy", "Jacson", 35));
		list.add(new Author("Dave", "John", 43));
		
		Collections.sort(list);
		for(Author a : list) {
			System.out.println(a.firstName + " " + a.lastName + ", " + a.age);
		}
	}

}

class Author implements Comparable<Author> {
	String firstName;
	String lastName;
	int age;
	
	public Author(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public int compareTo(Author au) {
		int first = this.firstName.compareTo(au.firstName);
		if(first == 0) {
			return this.lastName.compareTo(au.lastName);
		} else {
			return first;
		}
	}
	
}
