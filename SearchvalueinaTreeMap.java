/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.*;  
public class SearchvalueinaTreeMap {
    public static void main(String args[]){  
  
  // Create a tree map
   TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
  
  // Put elements to the map 
  tree_map1.put("C1", "Red");
  tree_map1.put("C2", "Green");
  tree_map1.put("C3", "Black");
  tree_map1.put("C4", "White"); 
    
 if(tree_map1.containsValue("Green")){
            System.out.println("The TreeMap contains value Green");
        } else {
            System.out.println("The TreeMap does not contain value Green");
        }
        if(tree_map1.containsValue("Pink")){
            System.out.println("The TreeMap contains value Pink");
            } else {
            System.out.println("The TreeMap does not contain value Pink");
        }
    }
}

