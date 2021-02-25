package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {

	private Passenger myPassenger;

	@BeforeEach
	void init() { myPassenger = new Passenger("Mr", "Ricky", "1234567891", "0851231234", 17);}

	@Test
	void testConstructorTitlePass() {
		assertEquals("Mr", myPassenger.getTitle());
	}

	@Test
	void testConstructorTitleFail() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Sir", "Ricky", "1234567891", "0851231234", 17));
		assertEquals("Invalid Title", e.getMessage());
	}


	@Test
	void testConstructorNamePass() {
		assertEquals("Ricky", myPassenger.getName());
	}

	@Test
	void testConstructorNameFail() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr", "ab", "1234567891", "0851231234", 17));
		assertEquals("Name must have more than 3 letters", e.getMessage());
	}


	@Test
	void testConstructorIDPass() {
		assertEquals("1234567891", myPassenger.getId());
	}

	@Test
	void testConstructorIDFail() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr", "Ricky", "123456789", "0851231234", 17));
		assertEquals("ID must be at least 10 digits", e.getMessage());
	}


	@Test
	void testConstructorPhonePass() {
		assertEquals("0851231234", myPassenger.getPhone());
	}

	@Test
	void testConstructorPhoneFail() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr", "Ricky", "1234567891", "08512312", 17));
		assertEquals("Phone must be at least 10 digits", e.getMessage());
	}


	@Test
	void testConstructorAgePass() {
		assertEquals(17, myPassenger.getAge());
	}

	@Test
	void testConstructorAgeFail() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr", "Ricky", "1234567891", "0851231234", 15));
		assertEquals("Must be older than 16", e.getMessage());

	}


}
