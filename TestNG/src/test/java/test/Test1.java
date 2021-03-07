package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(groups= {"Sanity"})
	public void method1() {
		System.out.println("inside method1");
	}


	@Test(groups= {"Regression"})
	public void method2() {
		System.out.println("inside method2");
	}

	@Test(groups= {"Regression"})
	public void method3() {
		System.out.println("inside method3");
	}

}
