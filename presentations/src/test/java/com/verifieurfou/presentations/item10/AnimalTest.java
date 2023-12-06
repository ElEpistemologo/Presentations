package com.verifieurfou.presentations.item10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.verifieurfou.presentations.item10.Animal;

public class AnimalTest {

	@Test
	public void test() {
		Animal dog = Animal.create("dog", 4);
		assertEquals("dog", dog.name());
		assertEquals(4, dog.numberOfLegs());

		assertTrue(Animal.create("dog", 4).equals(dog));
		assertFalse(Animal.create("cat", 4).equals(dog));
		assertFalse(Animal.create("dog", 2).equals(dog));

	}
	
	@Test
	public void tes2t() {
		Animal dog = Animal.create("dog", 4);
		assertEquals("Animal{name=dog, numberOfLegs=4}", dog.toString());
		
	}
	
}
