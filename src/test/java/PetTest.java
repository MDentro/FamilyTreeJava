import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @Test
    void shouldAddOwnerWhenNameIsGiven() {

        // arrange
        Person jan = new Person("Jan", "Jansen", "male", 30);
        Pet max = new Pet("Max", 3, "Poedel");

        // act
        max.addOwner(jan.getName());

        // assert
        assertEquals(jan.getName(), max.getOwner());
    }
}