package TestNG;

import org.testng.annotations.Test;

public class Invocationcount {
@Test(invocationCount=2,priority=-1)
public void test1() {
	System.out.println("Hi Test1");
}
	@Test(priority=0,invocationCount=-1)
	public void test2() {
		System.out.println("Hi Test2");
	}
		@Test(priority=0,enabled=false)
		public void test3() {
			System.out.println("Hi Test3");
	
}
}
