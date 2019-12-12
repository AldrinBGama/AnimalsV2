import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest {

        Dog dog = new Dog();
        Cat cat = new Cat();

        @Test
        void TestDogSound() {
            assertEquals("Spot Barks", dog.sounds());
        }

        @Test
        void TestDogEats() {
            assertNotEquals("Spot eats Food", dog.eats());
        }
//
//        @Test
//        void TestCatSound() {
//            assertEquals("Kitty Meow", cat.sounds());
//        }
//
//        @Test
//        void TestCatEats() {
//            assertEquals("Kitty eats Food", cat.eats());
//        }

//    void TestDog () {
//        assertTrue("Food".equalsIgnoreCase(dog.eats()));
//        assertTrue("food".equalsIgnoreCase(dog.eats()));
//        assertTrue("Barks".equalsIgnoreCase(dog.sounds()));
//        assertTrue("barks".equalsIgnoreCase(dog.sounds()));
//    }
//
//    @Test
//    void TestCat () {
//        assertTrue("Food".equalsIgnoreCase(cat.eats()));
//        assertTrue("food".equalsIgnoreCase(cat.eats()));
//        assertTrue("Meow".equalsIgnoreCase(cat.sounds()));
//        assertTrue("meow".equalsIgnoreCase(cat.sounds()));
//    } @Test

    }