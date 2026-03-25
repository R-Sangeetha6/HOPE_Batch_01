import java.lang.StringBuilder;
public class StringBuilderConcept {
      public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        //  append()
        sb.append(" World");
        System.out.println("After append: " + sb);

        // insert()
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        //  replace()
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        //  delete()
        sb.delete(2, 7);
        System.out.println("After delete: " + sb);

        //  deleteCharAt()
        sb.deleteCharAt(1);
        System.out.println("After deleteCharAt: " + sb);

        //  reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // length()
        System.out.println("Length: " + sb.length());

       
        // toString()
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
    }
}
