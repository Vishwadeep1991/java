/*final variable*/
class Sam{  
   final int MAX_VALUE=99;
   void myMethod(){  
      MAX_VALUE=101;
   }  
   public static void main(String args[]){  
      Sam obj=new  Sam();  
      obj.myMethod();  
   }  
}