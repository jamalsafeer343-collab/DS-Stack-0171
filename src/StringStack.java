package src;
import java.util.Stack; // Java ki apni built-in stack use kar rahe hain taake code chota ho

public class StringStack {
    public static void main(String[] args) {
        // Stack banana aur 5 strings daalna
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Dragonfruit");
        stack.push("Elderberry");

        //  Pehla Peek aur check karna
        System.out.println("=== TEST CASE 1 ===");
        System.out.println("Stack pehle: " + stack);
        System.out.println("Peeked item: " + stack.peek()); // Top element check kiya
        System.out.println("Stack baad mein: " + stack); // Tasdeeq ke stack change nahi hua

        //  Pop ke baad Peek check karna
        System.out.println("\n=== TEST CASE 2 ===");
        stack.pop(); // Ek item nikaal diya
        System.out.println("Stack pehle: " + stack);
        System.out.println("New Peeked item: " + stack.peek()); // Naya top check kiya
        System.out.println("Stack baad mein: " + stack); // Tasdeeq
    }
}
