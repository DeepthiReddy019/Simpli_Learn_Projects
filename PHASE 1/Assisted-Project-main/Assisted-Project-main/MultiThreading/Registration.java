package MultiThreading;

public class Registration {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("Deepthi");
        obj.setAge(21);
        obj.setRoll(24);
        System.out.println("My name: " + obj.getName());
        System.out.println("My age: " + obj.getAge());
        System.out.println("My roll: " + obj.getRoll());
    }

}
