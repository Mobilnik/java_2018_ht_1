package ru.milandr.courses.filippova;

import java.lang.*;
public class Dog
{
    private String name;
    public String getName ()
    {
        return this.name;
    }

    public void setName (String name)
    {
        this.name = name;
    }
    private String color;
    public String getColor ()
    {
        return this.color;
    }
    public void setColor (String color)
    {
        this.color = color;
    }
    private int width;
    public int getWidth ()
    {
        return this.width;
    }
    public void setWidth ( int width)
    {
        this.width = width;
    }
    private int height;
    public int getHeight ()
    {
        return this.height;
    }

    public void setHeight ( int height)
    {
        this.height = height;
    }

    private int length;
    public int getLength ()
    {
        return this.length;
    }
    public void setLength ( int length)
    {
        this.length = length;
    }

    public Dog(String n, String s, int w, int h, int l)
    {
        name = n;
        color = s;
        width = w;
        height = h;
        length = l;
    }

    public static int getVolume (Dog Dog)
    {
        return Dog.width * Dog.height * Dog.length;
    }

}
