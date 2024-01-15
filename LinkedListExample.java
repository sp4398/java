import java.util.*;
public class LinkedListExample{
    public static void main(String args[]){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Alice");
        linkedList.add("Bob");
        linkedList.add("Charlie");
        System.out.println("LinkedList: " + linkedList);
        linkedList.removeFirst();
        linkedList.addLast("David");
        System.out.println("Updated LinkedList: " + linkedList);
    }
}

