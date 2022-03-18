package io.railflow.demo.test.junit;

import io.railflow.annotations.Railflow;
import io.railflow.annotations.junit.CurrentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class SimpleTest {
	@Test
	@Disabled("ignore test")
	@Railflow(title = "ignored method")
	public void testPassed() {
		System.out.println("Test passed");
	}

	@Test
	public void testFailed() throws IOException {
		CurrentTest.addAttachment("test.txt", "whatever".getBytes(StandardCharsets.UTF_8));
		CurrentTest.addAttachment("test2.txt", "whatever2".getBytes(StandardCharsets.UTF_8));
		System.out.println("Test failed");
		Assertions.fail("Test failed");
	}
}
