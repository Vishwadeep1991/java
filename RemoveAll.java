import java.util.Vector;

public class RemoveAll{
	public static void main(String[] args){
	Vector<String> vector = new Vector<String>();
	vector.add("Java");
	vector.add("Cobol");
	vector.add("Pearl");
	vector.add("Python");
	vector.add("Ruby");
	vector.add("Php");
	System.out.println("Current size of Vector: "+vector.size());
	vector.clear();
	System.out.println("Size of Vector after clear(): "+vector.size());
	}
}