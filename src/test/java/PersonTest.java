import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void ShouldAddParentsWhenNamesAreGiven() {

        // arrange
        Person jan = new Person("Jan", "Jansen", "male", 30);
        String man = "Joop";
        String woman = "Maria";

        // act
        jan.addParents(woman, man);

        // assert
        assertEquals(man, jan.getFather());
        assertEquals(woman, jan.getMother());
    }

    @Test
    void ShouldAddChildrenWhenNamesAreGiven() {

        // arrange
        Person jan = new Person("Jan", "Jansen", "male", 30);
        String child = "Piet";

        // act
        jan.addChildren(child);

        // assert
        assertEquals(child, jan.getChildren().get(0));

    }

    @Test
    void ShouldAddSiblingWhenNamesAreGiven() {
        // arrange
        Person jan = new Person("Jan", "Jansen", "male", 30);
        String sibling= "Pieter";

        // act
        jan.addSibling(sibling);

        // assert
        assertEquals(sibling, jan.getSiblings().get(0));
    }

    @Test
    void shouldAddGrandChildrenWhenNamesAreGiven() {
        Person jan = new Person("Jan", "Jansen", "male", 30);
        String grandChild = "Jantje";

        // act
        jan.addGrandChildren(grandChild);

        // assert
        assertEquals(grandChild + " ", jan.getGrandChildren());
    }

    @Test
    void shouldReturnGrandChildrenWhenNamesAreGiven() {

        // arrange
        Person jan = new Person("Jan", "Jansen", "male", 30);

        // act
        jan.addGrandChildren("Jantje");
        jan.addGrandChildren("Johanna");
        jan.addGrandChildren("Maria");

        // assert
        assertEquals("Jantje Johanna Maria ", jan.getGrandChildren());
    }
}