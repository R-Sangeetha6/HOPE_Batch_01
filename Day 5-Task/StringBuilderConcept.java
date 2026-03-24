import java.lang.StringBuilder;
public class StringBuilderConcept {
      public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        // 1. append()
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. insert()
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // 3. replace()
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // 4. delete()
        sb.delete(2, 7);
        System.out.println("After delete: " + sb);

        // 5. deleteCharAt()
        sb.deleteCharAt(1);
        System.out.println("After deleteCharAt: " + sb);

        // 6. reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 7. length()
        System.out.println("Length: " + sb.length());

        // 8. capacity()
        System.out.println("Capacity: " + sb.capacity());

        // 9. charAt()
        System.out.println("Character at index 1: " + sb.charAt(1));

        // 10. setCharAt()
        sb.setCharAt(0, 'X');
        System.out.println("After setCharAt: " + sb);

        // 11. toString()
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
    }
}
