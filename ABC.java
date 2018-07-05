//private access modifier example
class ABC{  
   private double num = 100;
   private int square(int a){
	return a*a;
   }
}  
//TODO when i try to compile in eclipse it is giving issue,kindly fix it
public class Example{
   public static void main(String args[]){  
	ABC obj = new ABC();  
	System.out.println(obj.num); 
	System.out.println(obj.square(10));
   }  
}