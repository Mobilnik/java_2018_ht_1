public class person {
    private int height;
    private int weight;
    private String name;
    private String hair;
    private String sex;

    public int getHeight (){
        return this.height;
    }

    public void setHeight (int height){
        this.height = height;
    }

    public int getWeight (){
        return this.weight;
    }

    public void setWeight (int weight){
        this.weight = weight;
    }

    public String getName (){
        return this.name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getHair (){
        return this.hair;
    }

    public void setHair (String hair){
        this.hair = hair;
    }

    public String getSex (){
        return this.sex;
    }

    public void setSex (String sex){
        this.sex = sex;
    }

    public person (){}

    public person (String name, String sex){
        this.name = name;
        this.sex = sex;
    }

    public person (String name, String sex, int height, int weight, String hair){
        this.name = name;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.hair = hair;
    }
}
