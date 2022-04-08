package data_structures;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data_structures.data.
         *
         * Store and retrieve data from/to a database table.
         */



        Queue<String> myQueue = new LinkedList<>();

        myQueue.offer("Head First Java");
        myQueue.offer("Effective Java");
        myQueue.offer("Thinking In Java");
        myQueue.offer("Java");
        myQueue.offer("Learn Java");

        String topElement = myQueue.peek();
        System.out.println("TOP ELEMENT: " + topElement); // Head First Java

        String polledElement = myQueue.poll();
        System.out.println("POLLED (POPPED) ELEMENT: " + polledElement); // Head First Java

        topElement = myQueue.peek();
        System.out.println("TOP ELEMENT: " + topElement); // Effective Java

        String removeElement =myQueue.remove();
        System.out.println("remove (top) ELEMENT:" +removeElement); // Effective Java





    }

}
