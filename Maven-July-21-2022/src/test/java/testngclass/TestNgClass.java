package testngclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgClass {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@Test
	public void test() {
		System.out.println("test");
	}

}
