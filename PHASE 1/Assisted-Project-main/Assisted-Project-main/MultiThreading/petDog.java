package MultiThreading;

public class petDog {
    String name;
    String breed;
    int age;
    String color;
    public petDog(String name, String breed, int age, String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    public String getName()
    {
        return name;
    }
    public String getBreed()
    {
        return breed;
    }
    public int getAge()
    {
        return age;
    }
    public String getColor()
    {
        return color;
    }
    @Override
    public String toString()
    {
        return("Hello. This is  "+ this.getName()+ ".\nMy breed,age and color are " + this.getBreed()+", " + this.getAge()+ ", and"+ this.getColor() + ".");
    }
    public static void main(String[] args)
    {
        petDog scott = new petDog("Pradeep"," Retriver", 2, "Golden");
        System.out.println(scott.toString());
    }
}

