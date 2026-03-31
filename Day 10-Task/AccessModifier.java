class AccessDemo {

    private int a = 10;     
    int b = 20;                
    protected int c = 30;      
    public int d = 40;         

    private void showPrivate() {
        System.out.println("Private value: " + a);
    }

    void showDefault() {
        System.out.println("Default value: " + b);
    }

    protected void showProtected() {
        System.out.println("Protected value: " + c);
    }

    public void showPublic() {
        System.out.println("Public value: " + d);
    }

    public void displayAll() {
        showPrivate();
        showDefault();
        showProtected();
        showPublic();
    }
}

public class AccessModifier {
    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();

        obj.displayAll();        
        obj.showDefault();  
        obj.showProtected(); 
        obj.showPublic();     
    }
}