package ru.milandr.courses;

import ru.milandr.courses.vorobyev.Coordinats;
import ru.milandr.courses.vorobyev.Phone;

public class Application
{
    public static void main(String[] args)
    {
        Phone myPhone = new Phone("Apple", 1000, 1000);
        Coordinats coord1 = new Coordinats(-1, -1);
        Coordinats coord2 = new Coordinats(1, 1);
        System.out.println(Coordinats.getCircleEquation(coord1, coord2));
    }
}
