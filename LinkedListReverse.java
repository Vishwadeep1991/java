import java.util.LinkedList;
import java.util.Iterator;
class LinkedListReverse{
  public static void main(String[] args){
     LinkedList<String> list = new LinkedList<String>();
     list.add("Element1");
     list.add("Element2");
     list.add("Element3");
     list.add("Element4");
     System.out.println("LinkedList elements: "+list);
     Iterator it = list.descendingIterator();
     System.out.println("Elements in Reverse Order:");
     while (it.hasNext()) {
        System.out.println(it.next());
     }
  }
}