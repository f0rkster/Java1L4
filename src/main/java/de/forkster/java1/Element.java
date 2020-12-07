package de.forkster.java1;

public class Element
{

    private int value;


    private Element nextElement;

    public Element(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public Element getNext() {
        return nextElement;
    }

    public void setNext(Element nextElement) {
        this.nextElement = nextElement;
    }
}
