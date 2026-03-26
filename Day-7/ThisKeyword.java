class NameAndRollnumber{
    String name;
    String rollnumber;
    NameAndRollnumber(String name,String rollnumber){
        this.name=name;
        this.rollnumber=rollnumber;
    }
    void display(){
        System.out.println("Name:"+name+"\nRoll number:"+rollnumber);
    }

}
public class ThisKeyword{
    public static void main(String[] args){
        NameAndRollnumber s1 = new NameAndRollnumber("mithra","21BC009");
        s1.display();


    }
}