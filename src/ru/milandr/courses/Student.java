package ru.milandr.courses;
//
//

public class Student {
    private String name;
    private int age;
    private String university;
    private int courseNumber;
    public  boolean isFinish;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age, String university, int courseNumber, boolean isFinish) {
        this.name = name;
        this.age = age;
        this.university = university;
        this.courseNumber = courseNumber;
        this.isFinish = isFinish;
    }

    public Student(String name, int age, String university) {
        this.name = name;
        this.age = age;
        this.university = university;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }
}

