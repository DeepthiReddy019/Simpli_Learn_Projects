package Javaintandcol;

class Emp{
    int id;
    String name;

    Emp(int i,String n)
    {
        id=i;
        name=n;
    }

    void display() {
        System.out.println(id+" "+name);
    }
}

public class ParaConstructor {
    public static void main(String[] args) {

        Emp Emp1=new Emp(2,"Alex");
        Emp Emp2=new Emp(10,"Annie");
        Emp1.display();
        Emp2.display();
    }
}
