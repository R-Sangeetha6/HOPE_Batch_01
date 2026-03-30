interface Person {
    void role();
}

interface Student extends Person {
}

interface Teacher extends Person {
}

class CollegeMember implements Student, Teacher {

    public void role() {
        System.out.println("Person can be both Student and Teacher in the college");
    }
}

public class Main {
    public static void main(String[] args) {

        CollegeMember c = new CollegeMember();
        c.role();

    }
}