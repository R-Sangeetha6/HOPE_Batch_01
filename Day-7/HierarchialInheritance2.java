class father{
    void display(){
        System.out.println("I am a father and I have  a son and daughter");
    }
}
    class son extends father{
        void job(){
            System.out.println("Since you are going to job i am going to hand over the business to sister");
        }
    }
    class daughter extends father{
        void business(){
            System.out.println("I am going gto job so i don't have a proper time to manage the business so i am going to hand over the business to brother");
        }
    }
    public class HierarchialInheritance2 {
        public static void main(String[] args) {
            son s = new son();
            daughter d = new daughter();

            s.display();
            s.job();

            d.display();
            d.business();
        }

}