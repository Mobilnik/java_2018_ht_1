package classes;

public class some_class {
    private String man_name;
    private int grow;
    private int age;
    private boolean is_male;
    private String color_skin;

    public some_class(){
    }

    public some_class(String name){
        man_name = name;
    }

    public some_class(String name, int length, int num, boolean pol, String color){
        man_name = name;
        grow = length;
        age = num;
        is_male = pol;
        color_skin = color;
    }

    public String getMan_name(){
        return man_name;
    }

    public int getGrow(){
        return grow;
    }

    public int getAge(){
        return age;
    }

    public boolean getIs_male(){
        return is_male;
    }

    public String getColor_skin(){
        return color_skin;
    }

    public void setMan_name(String name){
        man_name = name;
    }

    public void setGrow(int num){
        grow = num;
    }

    public void setAge(int num){
        age = num;
    }

    public void setIs_male(boolean pol){
        is_male = pol;
    }

    public void setColor_skin(String color){
        color_skin = color;
    }
}
