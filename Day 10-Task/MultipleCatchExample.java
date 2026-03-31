public class MultipleCatchExample {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a / b;   

            int arr[] = new int[3];
            arr[5] = 10;        

        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");
        } 
        catch (Exception e) {
            System.out.println("Some other exception occurred");
        }

        System.out.println("Program continues...");
    }
}