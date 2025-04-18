package com.example.hookJVM;

import static com.example.hookJVM.Calculator.multiply;
import static com.example.hookJVM.Calculator.sum;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class HookJvmApplicationTests {

	@BeforeEach
	public final void initiateJVMHook(TestInfo testInfo) throws ClassNotFoundException {
		System.out.println("Trigger JVM.....");
		Class.forName("com.example.hookJVM.JVMShutdownHook");
	}

	@Test
	public void testSumMethod() {
		assertEquals(6, sum(2, 4));
	}

	@Test
	public void testMultiplyMethod() {
		assertEquals(4, multiply(2, 2));
	}
}
