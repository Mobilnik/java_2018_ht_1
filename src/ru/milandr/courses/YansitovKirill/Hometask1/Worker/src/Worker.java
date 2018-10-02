public class Worker {
    String Name;
    String Surname;
    int age;
    int experience;
    int salary;

    public void CalculateSalary()
    {
        salary = (experience/age)*1337;
    }

    public boolean IsPensioner()
    {
        if(age>=65)
            return true;
        else
            return false;
    }

    public Worker(String name, String surname, int age, int experience) {
        Name = name;
        Surname = surname;
        this.age = age;
        this.experience = experience;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
