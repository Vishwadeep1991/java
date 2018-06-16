package com.vengines;
import com.Engines.Engine;

public class VEngines extends Engine{
	public void VEngine3000cc(){
	System.out.println(engine2000cc());
	}
public static void main(String[]args){
	VEngines ve=new VEngines();
	ve.VEngine3000cc();
	}
}