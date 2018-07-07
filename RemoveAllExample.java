import java.util.LinkedList;
public class RemoveAllExample{
 
 public static void main(String[] args){
    LinkedList<String> linkedlist = new LinkedList<String>();
    linkedlist.add("Item1");
    linkedlist.add("Item2");
    linkedlist.add("Item3");
    linkedlist.add("Item4");
    linkedlist.add("Item5");
    System.out.println("Before clear():");
    for(String str: linkedlist){
       System.out.println(str);
    }
    linkedlist.clear();
    System.out.println("After clear():");
    for(String str2: linkedlist){
       System.out.println(str2);
    }
 }
}