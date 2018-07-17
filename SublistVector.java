import java.util.Vector;
import java.util.List;
 
public class SublistVector{
  public static void main(String[] args){
    Vector<String> vector = new Vector<String>();
    vector.add("Item1");
    vector.add("Item2");
    vector.add("Item3");
    vector.add("Item4");
    vector.add("Item5");
    vector.add("Item6");
    List subList = vector.subList(2,5);
     System.out.println("Sub list elements :");
    for(int i=0; i < subList.size() ; i++){
       System.out.println(subList.get(i));
    }
  }
}