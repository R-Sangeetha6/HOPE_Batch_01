

public class MethodConcept {
    //without Parameter and without return type
    public void square() {
        int num = 5;
        int result = num * num;
        System.out.println("Square: " + result);
    }
    //with parameter and without return type
     public void square(int num) {
        int result = num * num;
        System.out.println("Square: " + result);
    }
    //without parameter and with return type
      public  int square1() {
        int num = 6;
        return num * num;
    }
    //with parameter and with return type
     public int square1(int num) {
        return num * num;
    }


    public static void main(String[] args) {
        MethodConcept obj = new MethodConcept();
        MethodConcept obj2 = new MethodConcept();
        obj.square();
        obj.square(10);
        int result = obj2.square1();
        System.out.println("Square: " + result);   
        int result2 = obj2.square1(7);
        System.out.println("Square: " + result2); 
    }
}