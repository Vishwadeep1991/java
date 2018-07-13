import java.util.LinkedList;
import java.util.Iterator;
public class IteratorExample{
 
 public static void main(String[] args){
    LinkedList<String> linkedlist = new LinkedList<String>();
    linkedlist.add("Delhi");
    linkedlist.add("Agra");
    linkedlist.add("Mysore");
    linkedlist.add("Chennai");
    linkedlist.add("Pune");
    Iterator it = linkedlist.iterator();
    System.out.println("LinkedList elements:");
    while(it.hasNext()){
       System.out.println(it.next());
    }
 }
}