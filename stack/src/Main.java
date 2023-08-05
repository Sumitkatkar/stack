public class Main {
    public static void main(String[] args) {
       Stack s1 = new Stack();

       System.out.println("is empty = "+s1.isEmpty());

       s1.push(10);
       s1.push(20);
       s1.push(30);
       s1.push(40);
       s1.push(50);

       s1.push(60);

       s1.show();
       System.out.println();

       System.out.println("deleted = "+s1.pop());

       System.out.println("peeked top element = "+s1.peek());

       System.out.println("size of stack = "+s1.size());

       System.out.println("is empty = "+s1.isEmpty());

    }
}