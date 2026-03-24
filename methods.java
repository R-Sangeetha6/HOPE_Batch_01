public class methods{
    int value=10;
    public static int square(int num){
        return num*num;
    }
    public static void main(String[] args) {
        methods obj=new methods();
        obj.value=20;   
        System.out.println(obj.value);
        System.out.println(square(5));


    }
}