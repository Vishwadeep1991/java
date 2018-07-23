import java.util.Vector;
public class RemoveVector{
	public static void main(String[] args){
		Vector<String> vector = new Vector<String>();
		vector.add("Java");
		vector.add("C");
		vector.add("Pearl");
		vector.add("Python");
		vector.add("Cobol");
	System.out.println("Vector elements before remove(): ");
	for(int i=0; i < vector.size(); i++)
	{
		System.out.println(vector.get(i));
	}
	Object obj = vector.remove(2);
	System.out.println("\nElement removed from Vector is: ");
	System.out.println(obj);
	System.out.println("\nVector elements after remove():");
	for(int i=0; i < vector.size(); i++)
	{
		System.out.println(vector.get(i));
	}
	}
}