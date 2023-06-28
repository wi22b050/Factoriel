package com.example.demo;

import com.example.demo.collector.FactorielCollector;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FactorielApplicationTests {

	@Test
	void testFactorialOfNumber() {
		FactorielCollector controller = new FactorielCollector();

		int result = controller.calcFactorial(5);
		assertEquals(120, result);
	}

}
