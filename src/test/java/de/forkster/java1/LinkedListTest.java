package de.forkster.java1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListTest
{
    LinkedList linkedList   = new LinkedList();
    Element firstElement    = new Element(45);
    Element secondElement   = new Element(67);
    Element thirdElement    = new Element(56);
    Element fourthElement   = new Element(78);
    Element fifthElement    = new Element(99);

    @BeforeEach
    void setUp()
    {
        linkedList.add(firstElement);
        linkedList.add(secondElement);
        linkedList.add(thirdElement);
        linkedList.add(fourthElement);
        linkedList.add(fifthElement);
    }


    @Test
    void element_should_have_reference_to_next_element()
    {
        // Then
        assertEquals(firstElement.getNext(), secondElement, "The first element should have a reference to the second element!");
    }

    @Test
    void the_third_element_should_have_a_reference_to_the_fourth_element()
    {
        assertEquals(thirdElement.getNext(), fourthElement, "The fourth element should have a reference to the fifth element!");
    }

    @Test
    void the_fourth_element_should_have_a_reference_to_the_fifth_element()
    {
        assertEquals(fourthElement.getNext(), fifthElement, "The fourth element should have a reference to the fifth element!");
    }
}
