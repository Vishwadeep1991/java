class D{  
   //Blank final variable
   final int MAX_VALUE;
	 
   D(){
      //It must be initialized in constructor
      MAX_VALUE=100;
   }
   void myMethod(){  
      System.out.println(MAX_VALUE);
   }  
   public static void main(String args[]){  
      D obj=new  D();  
      obj.myMethod();  
   }  
}