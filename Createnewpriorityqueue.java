/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Appendhashset;

/**
 *
 * @author Lenovo
 */
import java.util.PriorityQueue;
public class Createnewpriorityqueue {
    public static void main(String[] args) {
  PriorityQueue<String> queue=new PriorityQueue<String>();  
  queue.add("Red");
  queue.add("Green");
  queue.add("Orange");
  queue.add("White");
  queue.add("Black");
  System.out.println("Elements of the Priority Queue: ");
  System.out.println(queue);
 }
}

