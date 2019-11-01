package io.github.notsandy.librarybooking;

import org.testng.TestNG;

public class Run {
	
	static TestNG testNG;
	public static void main(String[] args) {
		
		testNG = new TestNG();
		testNG.setTestClasses(new Class[] {librarybooking.class});
		testNG.run();
	}

}
