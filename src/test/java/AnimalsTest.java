import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest {




    Dog dog = new Dog();
    Cat cat = new Cat();
    @Test
    void TestDogSound() {
        assertEquals("Bark", dog.sounds());
    }

    @Test
    void TestDogEats() {
        assertEquals("Food", dog.eats());
    }

    @Test
    void TestCatSound() {
        assertEquals("Meow", cat.sounds());
    }

    @Test
    void TestCatEats() {
        assertEquals("Food", cat.eats());
    }

    @Test
    void TestDog () {
        assertTrue("Food".equalsIgnoreCase(dog.eats()));
        assertTrue("food".equalsIgnoreCase(dog.eats()));
        assertTrue("Bark".equalsIgnoreCase(dog.sounds()));
        assertTrue("bark".equalsIgnoreCase(dog.sounds()));
    }

    @Test
    void TestCat () {
        assertTrue("Food".equalsIgnoreCase(cat.eats()));
        assertTrue("food".equalsIgnoreCase(cat.eats()));
        assertTrue("Meow".equalsIgnoreCase(cat.sounds()));
        assertTrue("meow".equalsIgnoreCase(cat.sounds()));
    }
}