package de.forkster.java1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ElementTest
{
    @Test
    void an_element_should_store_an_int_value()
    {
        // Given
        Element element = new Element(23);

        // When
        int value = element.getValue();

        // Then
        assertEquals(23, value, "The element should have a value color.");
    };
}
