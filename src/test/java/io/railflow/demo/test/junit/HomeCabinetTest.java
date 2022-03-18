package io.railflow.demo.test.junit;

import io.railflow.annotations.CustomField;
import io.railflow.annotations.Railflow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Railflow(caseType = "Security", casePriority = "High")
public class HomeCabinetTest {

	@Test
	public void changePassword() {
		throw new RuntimeException("Unexpected exception");
	}

	@Test
	public void changePasswordFailOnIncorrectConfirmation() {
		System.out.println("change password failed with incorrect confirmation");
	}

	@Test
	public void changePasswordFailOnIncorrectPassword() {
		System.out.println("change password fail with incorrect password");
	}

	@Test
	public void changeEmail() {
		System.out.println("Change email");
	}

	@Railflow(title = "new title from method annotation", caseFields = {
			@CustomField(name = "Required text field", value = "required text value from method annotation")}, smartFailureAssignment = {
			"user2@company.com"})
	@Test
	public void changeEmailFailOnInvalidEmail() {
		Assertions.fail("Email is empty");
	}

}
