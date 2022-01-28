package Javadeep;



public class PrivateAS {
    public static void main(String[] args) {
        //private
        System.out.println("Access Specifier is private here");
        PrivateAS obj = new PrivateAS();
        //trying to access private method of another class
        obj.display();
    }

    private void display() {
        // TODO Auto-generated method stub

    }
}