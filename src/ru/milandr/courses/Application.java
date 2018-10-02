package ru.milandr.courses;

import ru.milandr.courses.vorobyev.Coordinats;
import ru.milandr.courses.vorobyev.Phone;

class Application {
    public static void main(String[] args) {
        Coordinats coord1 = new Coordinats(1, 1);
        Coordinats coord2 = new Coordinats(2, 2);
        Phone iphone = new Phone("Apple");
        System.out.println(Coordinats.getLinearEquation(coord1, coord2));
        System.out.println(iphone.getOperatingSystem());
    }
}
