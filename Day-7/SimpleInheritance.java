class Parent{
    int x;
    void display(){
        System.out.println("I am inside the parent class");
    }
    }
    class Child extends Parent{
        void display(){
            System.out.println("I am inside the child class");
        }
        }
        public class SimpleInheritance {
        public static void main(String[] args) {
            Parent p =new Parent();
            p.display();
            //Child c =new Parent();
           // c.display();
            //Child c = new Child();
           // c.display();
    }
}