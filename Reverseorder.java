/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.Iterator;
import java.util.LinkedList;
public class Reverseorder {
    // Java program to Iterate a LinkedList in Reverse Order
// using descending Iterator




	public static void main(String[] args)
	{
		LinkedList<String> linkedList = new LinkedList<>();
		
		// adding elements to linked list
		linkedList.add("Geeks");
		linkedList.add("For");
		linkedList.add("Geek");
		linkedList.add("2020");
		linkedList.add("2021");

		// getting an iterator which points at the
		// end of the linkedlist
		Iterator<String> iterator = linkedList.descendingIterator();

		// traversing the linkedlist
		// hasNext() will tell if previous element is
		// available or not
		// next() with descending iterator will return the
		// previous element
		// and after getting the previous element
		// is moves the cursor to next previous element.
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}


