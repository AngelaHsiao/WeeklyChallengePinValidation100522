import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.revature.weekly.pinvalidation.PinValidation;

class PinValidationTest {

	@Test
	void testPinPass4() {
		String pin = "0123";
		Assertions.assertTrue(PinValidation.validate(pin));
	}
	
	@Test
	void testPinPass6() {
		String pin = "012345";
		Assertions.assertTrue(PinValidation.validate(pin));
	}
	
	@Test
	void testPinFailShort() {
		String pin = "012";
		Assertions.assertFalse(PinValidation.validate(pin));
	}
	
	@Test
	void testPinFailLength() {
		String pin = "01234";
		Assertions.assertFalse(PinValidation.validate(pin));
	}
	
	@Test
	void testPinFailLong() {
		String pin = "0123456";
		Assertions.assertFalse(PinValidation.validate(pin));
	}
	
	@Test
	void testPinFailEmpty() {
		String pin = "";
		Assertions.assertFalse(PinValidation.validate(pin));
	}
	
	@Test
	void testPinFailChar() {
		String pin = "123A";
		Assertions.assertFalse(PinValidation.validate(pin));
	}
	
	@Test
	void testPinFailWhiteSpace() {
		String pin = " 1234";
		Assertions.assertFalse(PinValidation.validate(pin));
	}

}
