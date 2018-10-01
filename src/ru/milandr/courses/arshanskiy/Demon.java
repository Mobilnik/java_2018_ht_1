package ru.milandr.courses.arshanskiy;

import java.util.Scanner;

public class Demon {
    public String name;
    public String element;
    public int level;
    public int power;
    public int magic;
    public int legion;

    public Demon(){
        legion = 666;
    }

    //Special writing...

    public void showLegion(){
        System.out.println(legion);
    }

    //Writing...
    public void showName(){
        System.out.println(name);
    }

    public void showElement(){
        System.out.println(element);
    }

    public void showLevel(){
        System.out.println(level);
    }

    public void showPower(){
        System.out.println(power);
    }

    public void showMagic(){
        System.out.println(magic);
    }

    //reading...

    Scanner in = new Scanner(System.in);

    public void inputName(){
        name = in.nextLine();
    }

    public void inputElement(){
        element = in.nextLine();
    }

    public void inputLevel(){
        level = in.nextInt();
    }

    public void inputPower(){
        power = in.nextInt();
    }

    public void inputMagic(){
        magic = in.nextInt();
    }



}