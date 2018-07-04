import java.util.LinkedList;
public class LinkedListRemove{
 
 public static void main(String[] args) {
    LinkedList<String> linkedlist = new LinkedList<String>();
    linkedlist.add("Item1");
    linkedlist.add("Item2");
    linkedlist.add("Item3");
    linkedlist.add("Item4");
    linkedlist.add("Item5");
    System.out.println("LinkedList Elements are:");
    for(String str: linkedlist){
    System.out.println(str);
    }
    Object firstElement = linkedlist.removeFirst();
    System.out.println("\nElement removed: "+ firstElement);
    Object lastElement = linkedlist.removeLast();
    System.out.println("Element removed: "+ lastElement);
    System.out.println("\nList Elements after Remove:");
    for(String str2: linkedlist){
       System.out.println(str2);
    }
 }
}