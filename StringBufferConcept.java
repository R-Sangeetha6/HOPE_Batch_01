public class StringBufferConcept {
    public static void main(String[] args) {

        // Create StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        //  append()
        sb.append(" World");
        System.out.println("append(): " + sb);

        //  insert()
        sb.insert(5, " Java");
        System.out.println("insert(): " + sb);

        // replace()
        sb.replace(6, 10, "C++");
        System.out.println("replace(): " + sb);

        //  delete()
        sb.delete(6, 10);
        System.out.println("delete(): " + sb);

        //  deleteCharAt()
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt(): " + sb);

    //  reverse()
        sb.reverse();
        System.out.println("reverse(): " + sb);

        //  capacity()
        System.out.println("capacity(): " + sb.capacity());

        // length()
        System.out.println("length(): " + sb.length());
        // substring()
        String sub = sb.substring(1, 4);
        System.out.println("substring(): " + sub);
    }
}