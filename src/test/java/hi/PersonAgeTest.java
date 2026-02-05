package hi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonAgeTest {
	PersonAge R;
	PersonAge J;
	PersonAge T;
	PersonAge H;

	@BeforeEach
	void setUp() throws Exception {
		R = new PersonAge("Emma", "Daman", 22);
		J = new PersonAge("Sam", "Coffey", 22);
		T = new PersonAge("Max", "Galvin", 22);
		H = new PersonAge("Hanna", "McNamarra", 12);
	}
 
	@Test
	void testMakePersonException() {
		assertThrows(underAgeException.class,
				()->{
					PersonAge child = H.makePerson(R);
					});
	}
	
	@Test
	void testMakePerson() throws underAgeException {
		PersonAge child = R.makePerson(J);
		
		assertEquals(R.firstname, child.firstname);
		assertEquals(J.lastname, child.lastname);
		assertEquals(0, child.age);
	}
	
	@Test
	void testToString() {
		assertEquals(R.toString(), "Emma Daman, 22");
		assertEquals(J.toString(), "Sam Coffey, 22");
		assertEquals(T.toString(), "Max Galvin, 22");
	}
}
