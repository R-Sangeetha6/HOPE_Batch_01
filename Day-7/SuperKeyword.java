class SuperExample{

    public SuperExample() {
        System.out.println("called in superExample");
    }
    void hello(){
        System.out.println("welcome to my home");
    }
}
    class SuperExample2 extends SuperExample{
     public SuperExample2() {
        System.out.println("called in superExample2");
    }
    void reject(){
        System.out.println("I haven't called you");
        super.hello();
    }

}
public class SuperKeyword{
    public static void main(String[] args){
        SuperExample2 s1 = new SuperExample2();
        
        s1.reject();

    
}
}