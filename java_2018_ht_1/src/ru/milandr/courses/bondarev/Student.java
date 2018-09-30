package ru.milandr.courses.bondarev;

/**
 * The {@code Student} class describes a student.
 * An object of type {@code Student} contains {@code String} name, {@code int} age and {@code String} language fields.
 */

public class Student {

    private String name;
    private String language;
    private int age;

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
}
