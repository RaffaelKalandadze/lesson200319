import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibTest {

	@Test
	public void test1() {
		int n = 0;
		assertEquals(0,fibonacci.fib(n),"The number is not valid");
	}
	public void test2() {
		int n = 1;
		assertEquals(1,fibonacci.fib(n),"The number is not valid");
	}
	public void test3() {
		int n = 2;
		assertEquals(1,fibonacci.fib(n),"The number is not valid");
	}
	public void test4() {
		int n = 3;
		assertEquals(2,fibonacci.fib(n),"The number is not valid");
	}
	public void test5() {
		int n = 10;
		assertEquals(55,fibonacci.fib(n),"The number is not valid");
	}
	public void test6() {
		int n = 20;
		assertEquals(6765,fibonacci.fib(n),"The number is not valid");
	}
	public void test7() {
		int n = 30;
		assertEquals(832040,fibonacci.fib(n),"The number is not valid");
	}
	public void test8() {
		int n = 50;
		assertEquals(12586269025L,fibonacci.fib(n),"The number is not valid");
	}
	public void test9() {
		int n = 70;
		assertEquals(190392490709135L,fibonacci.fib(n),"The number is not valid");
	}
	public void test10() {
		int n = 90;
		assertEquals(2880067194370816120L,fibonacci.fib(n),"The number is not valid");
	}
}
