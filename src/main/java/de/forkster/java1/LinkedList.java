package de.forkster.java1;

public class LinkedList 
{
    Element lastElement = null;

    public void add(Element element)
    {
        if(thereIsNoLastElement())
        {
            lastElement = element;
        }
        else
        {
            lastElement.setNext(element);
            lastElement = element;
        }
    }

    private boolean thereIsNoLastElement() {
        return lastElement == null;
    }
}
