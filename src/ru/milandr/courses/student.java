package ru.milandr.courses;

public class student{

    private int age;
    private int yearOfEducation;
    private String name;
    private String department;
    private String category;

    public int getAge (){
        return this.age;
    }
    public void setAge (int age){
        this.age = age;
    }
    public int getYearOfEducation (){
        return this.yearOfEducation;
    }
    public void setYearOfEducation (int yearOfEducation){
        this.yearOfEducation = yearOfEducation;
    }
    public String getName (){
        return this.name;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getDepartment (){
        return this.department;
    }
    public void setDepartment (String department){
        this.department = department;
    }
    public String getCategory (){
        return this.category;
    }
    public void setCategory (String category){
        this.category = category;
    }

    public student (){}

    public student (int yearOfEducation, String category){
        this.yearOfEducation = yearOfEducation;
        this.category = category;
    }

    public student (int age, int yearOfEducation, String name, String department, String category){
        this.age = age;
        this.yearOfEducation = yearOfEducation;
        this.name = name;
        this.department = department;
        this.category = category;
    }
}