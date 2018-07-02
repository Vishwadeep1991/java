import java.util.LinkedList;

public class AddExample{
 public static void main(String[] args){
int i,j;
for (i=0; i<=5; i++)
{
  for (j=0; j<=5; j++)
{
    LinkedList<String> linkedlist = new LinkedList<String>();
    linkedlist.add("AM");
    linkedlist.add("BN");
    linkedlist.add("CO");
    linkedlist.add("DP");
    linkedlist.add("EQ");
    System.out.println(linkedlist);
    linkedlist.addFirst("FIRST");
    System.out.println(linkedlist);
    linkedlist.addLast("LAST");
    System.out.println(linkedlist);
  System.out.println("Time complexity is n(1)");
   }
  }
 }

}