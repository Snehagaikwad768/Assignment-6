/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterate_through_elements_a_array_list;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class InsertElementInFistPosition {
    public static void main(String[] args) {
  // Creae a list and add some colors to the list
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Green");
  list_Strings.add("Orange");
  list_Strings.add("White");
  list_Strings.add("Black");
  // Print the list
  System.out.println(list_Strings);
  // Now insert a color at the first and last position of the list
  list_Strings.add(0, "Pink");
  list_Strings.add(5, "Yellow");
  // Print the list
  System.out.println(list_Strings);
 }
}

