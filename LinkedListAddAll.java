import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
class LinkedListAddAll{
    public static void main(String[] args) {
     LinkedList<String> list = new LinkedList<String>();
     list.add("AA");
     list.add("BB");
     list.add("CC");
     list.add("DD");
     System.out.println("Before: LinkedList: " + list);
     List<String> arrayList = new ArrayList<String>();
     arrayList.add("Item1");
     arrayList.add("Item2");
     arrayList.add("Item3");
     list.addAll(arrayList);
     System.out.println("After: LinkedList: " + list);
  }
}