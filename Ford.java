package com.cars;
import com.Engines.Engine;

public class Ford{
	void move(){
	Engine e=new Engine();
	System.out.println("Moving with"+e.engine1000cc());
	}
  public static void main(String[]args){
	Ford f=new Ford();
	f.move();
  }
}