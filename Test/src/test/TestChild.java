package test;

import java.io.IOException;

import org.springframework.util.SystemPropertyUtils;

public class TestChild 
{
	
	 public static synchronized void retunString(String var)
	 {
		 System.out.println("Return String");
	 }
	 

	 public static synchronized void retunString2(String var)
	 {
		 System.out.println("Return Stringssss");
	 }
	 
	 
	 public static void main(String s[])
	 {
		 
		/* Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				retunString("sdfsf");
				
			}
		});
		 
		 
		 Thread t2=new Thread(new Runnable() {
				
				@Override
				public void run() {
					retunString2("sdfsf");
					
				}
			});
		 
		 
		 t1.start();
		 t2.start();*/
		 
		getVal();
		 
	 }
	 
	 
	static int getVal()
	 {
		 try 
		 {
			 System.out.println("in catch");
			 throw new IOException(); 
		 }
		 catch(Exception e)
		 {
			 System.out.println("in catch");
			 return 0;
		 }
		 finally
		 {
			 System.out.println("in finally");
			
		 }
	 }
	 
	 
}
