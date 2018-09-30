package ru.milandr.courses.Perepelitsyn;

public class Kachok {
    private int mass;
    private int height;
    private boolean chemistry;
    private boolean gachi;
    private String name;

    public void setMass(int massive){
        this.mass = massive;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setChemistry( boolean chemistry){
        this.chemistry = chemistry;
    }
    public void setGachi( boolean natural){
        this.gachi = natural;
    }
    public void setName(String Lexa) {
        this.name = Lexa;
    }

    public int getMass() {
        return this.mass;
    }
    public int getHeight() {
        return this.height;
    }
    public boolean isChemistry() {
        return this.chemistry;
    }
    public boolean isGachi() {
        return gachi;
    }
    public String getName() {
        return name;
    }

    public Kachok (int height, int mass, boolean gachi, boolean chemistry, String name){
        this.height = height;
        this.chemistry = chemistry;
        this.gachi = gachi;
        this.mass = mass;
        this.name = name;
    }
    public Kachok (boolean gachi, boolean chemistry, String name){
        this.chemistry = chemistry;
        this.gachi = gachi;
        this.name = name;
    }
}
