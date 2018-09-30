package ru.milandr.courses.Ozherelev;

public class Employee {
    private String Name;
    private int ID;
    private int ProjectID;
    private int GroupID;
    private int Age;

    Employee(String name, int id, int proj, int group, int age)
    {
        Name = name;
        ID = id;
        ProjectID = proj;
        GroupID = group;
        Age = age;
    }

    Employee(String name, int id, int group, int age)
    {
        Name = name;
        ID = id;
        ProjectID = id + group;
        GroupID = group;
        Age = age;
    }

    public void SetAge(int age)
    {
        Age = age;
    }

    public int GetAge()
    {
        return Age;
    }

    public void SetGroupID(int group)
    {
        GroupID = group;
    }

    public int GetGroupID()
    {
        return GroupID;
    }

    public void SetProjectID(int proj)
    {
        ProjectID = proj;
    }

    public int GetProjectID()
    {
        return ProjectID;
    }

    public void SetID(int id)
    {
        ID = id;
    }

    public int GetID()
    {
        return ID;
    }

    public void SetName(String name)
    {
        Name = name;
    }

    public String GetName()
    {
        return Name;
    }

}
