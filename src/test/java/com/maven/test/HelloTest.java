package com.maven.test;

import org.testng.Assert;
import org.testng.annotations.Test;





public class HelloTest {
	
	
	
	
	@Test (priority=1)
	public void Sum(){
		System.out.println("Sum method");
		int a = 100;
		int b = 200;
		Assert.assertEquals(300, (a+b));
	}
	
	@Test (priority=2)
	public void Subtraction(){
		System.out.println("Subtract method");
		int a = 500;
		int b = 200;
		Assert.assertEquals(300, (a-b));
	}
	
	@Test (priority=3)
	public void Multiplication(){
		System.out.println("Multiply method");
		int a = 100;
		int b = 200;
		Assert.assertEquals(20000, (a*b));
	}
	
	@Test (priority=4)
	public void Division(){
		System.out.println("Divide method");
		int a = 100;
		int b = 200;
		Assert.assertEquals(2, (b/a));
	}
	

}
