package Tasks_Day2;

import java.util.*;
import java.lang.*;
import java.io.*;

class Animal{
   
    
	
    public  void f(int... i1)
    {
        System.out.println("Parent display");
    }
     public void f(int[] i1)
	{

		System.out.println("Child  display");
        for(int j:i1)
        System.out.println(j);
	}
}
class Ideone
{
	

	public static void main (String[] args) throws java.lang.Exception
	{
		Animal a=new Animal();
        
        a.f(new int[]{1,2,3,4});
		
	}
}


