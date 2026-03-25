 class Apartment{
     void display(){
        System.out.print("I am inside Apartment class");

    }


}



public class ClassObjects {
    public static void main(String[] args) {
       
        ClassObjects obj1 = new ClassObjects();

        System.out.println("I am inside classObjects class");
        Apartment ap=new Apartment();
        ap.display();

        
        
       
    }
}