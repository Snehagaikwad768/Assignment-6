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
import java.util.ArrayList;
public class Iterate_through_elements_a_array {
    public static void main(String[] args) {
    // Creating an array list
    ArrayList<String> languages = new ArrayList<>();
    languages.add("Java");
    languages.add("JavaScript");
    languages.add("Python");
    System.out.println("ArrayList: " + languages);

    // Using for loop
    System.out.println("Iterating over ArrayList using for loop: ");

    for(int i = 0; i < languages.size(); i++) {
      System.out.print(languages.get(i));
      System.out.print(", ");
    }
  }
}
