package ru.milandr.courses.dmitrieva;


public class MyCar {
    private int length;
    private int width;
    private int height;
    private String Colour;
    private String Model;

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }


    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }



    public String getColour() {
        return Colour;
    }
    public void setColour(String colour) {
        Colour = colour;
    }


    public String getModel() {
        return Model;
    }
    public void setModel(String model) {
        Model = model;
    }



    public MyCar(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.Colour = "Black";
        this.Model = "Toyota";
    }
    public MyCar(int length, int width, int height, String Colour, String Model) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.Colour = Colour;
        this.Model = Model;
    }

}
