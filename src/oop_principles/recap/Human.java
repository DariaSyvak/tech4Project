package oop_principles.recap;

public class Human {
    static {
        System.out.println("Earth is existing");
    }

    {
        System.out.println("Human is created successfully");
    }

    public Human(String name) {
        this.name = name;
    }


    public Human(String name, char sex, int age, String location, double weight, double height) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.location = location;
        this.weight = weight;
        this.height = height;
    }

    public Human(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;

    }


    public String name;
    public char sex;
    public int age;
    public double weight;
    public double height;
    public String location;
    public static boolean hasRights;
    public static boolean hasHeart;
    public static int arms = 2;
    public static int legs = 2;


    @Override
    public String toString() {
        return "Human{" +
                (name == null ? "" : "name='" + name + '\'') +
                (sex == '\u0000' ? "" : ", sex=" + sex) +
                (age == 0 ? "" : ", age=" + age) +
                (weight == 0.0 ? "" : ", weight=" + weight) +
                (height == 0.0 ? "" : ", height=" + height) +
                (location == null ? "" : ", location='" + location + '\'') +
                '}';
    }

    public void isFromChicago() {
        System.out.println(location != null && location.equalsIgnoreCase("Chicago")
                ? name + " is from Chicago"
                : name + " is not from Chicago");

    }


}