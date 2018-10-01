public class Phystech {
    private String name;
    private String sex;
    private int height;
    private String department;
    private boolean drinker;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return this.sex;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDrinker(boolean youWannaDrink) {
        this.drinker = youWannaDrink;
    }

    public boolean isDrinker() {
        return this.drinker;
    }

    public Phystech () {}

    public Phystech (String name, boolean drinker) {
        this.name = name;
        this.drinker = drinker;
    }

    public Phystech (String name, String sex, int height, String department, boolean drinker) {
        this.name = name;
        this.sex = sex;
        this.height = height;
        this.department = department;
        this.drinker = drinker;
    }
}
