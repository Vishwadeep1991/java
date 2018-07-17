import java.util.Collections;
import java.util.Vector;
public class SortingVector{
 public static void main(String[] args){
    Vector<String> vector = new Vector<String>();
    vector.add("Waani");
    vector.add("Anushka");
    vector.add("Hemant");
    vector.add("Firoz");
    vector.add("Tanmay");
    System.out.println("Vector elements before sorting: ");
    for(int i=0; i < vector.size(); i++){
       //get(i) method fetches the element from index i
       System.out.println(vector.get(i));
    }
    Collections.sort(vector);
    System.out.println("Vector elements after sorting: :");
    for(int i=0; i < vector.size(); i++){
       System.out.println(vector.get(i));
    }
 } 
}