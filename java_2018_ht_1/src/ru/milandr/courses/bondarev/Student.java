package ru.milandr.courses.bondarev;

/**
 * The {@code Student} class describes a student.
 * An object of type {@code Student} contains {@code String} name, {@code int} age, height,  and {@code String} language fields.
 */

public class Student {

    private String name;
    private String language;
    private int age;
    private int height;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }



    public Student (String name, String language, int age, int height, int weight){
        this.name = name;
        this.language = language;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}
