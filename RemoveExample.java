import java.util.LinkedList;
public class RemoveExample{
 
 public static void main(String[] args) {
 
    LinkedList<String> linkedlist = new LinkedList<String>();
    linkedlist.add("Item1");
    linkedlist.add("Item2");
    linkedlist.add("Item3");
    linkedlist.add("Item4");
    linkedlist.add("Item5");
    System.out.println("Before Remove:");
    for(String str: linkedlist){
       System.out.println(str);
    }
    linkedlist.remove("Item4");
    System.out.println("\nAfter Remove:");
    for(String str2: linkedlist){
       System.out.println(str2);
    }
 }
}