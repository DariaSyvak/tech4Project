package collections.linkedList;

import java.util.LinkedList;

public class ArrayListVersusLinkedList {
    public static void main(String[] args) {

        LinkedList<Double> numbers = new LinkedList<>();
        numbers.add(10.5);
        numbers.add(12.5);
        numbers.add(13.3);
        numbers.add(17.7);
        numbers.add(2,12.3);

        System.out.println(numbers);
        System.out.println("LOOPING LINKED-LIST");
        for (Double number : numbers) {
            System.out.println(number);

        }
        System.out.println("SOME METHODS OF LINKED-LIST");
        System.out.println(numbers.get(0));
        ;//10.5
        System.out.println(numbers.getFirst());
        ;//10.5
        System.out.println(numbers.getLast());
        ;//17.7

        System.out.println("SOME ADDITIONAL METHODS OF LINKED-LIST");
        System.out.println(numbers.peek());//10.5
        System.out.println(numbers.peekFirst());//10.5
        System.out.println(numbers.peekLast());//17.7

        System.out.println(numbers);
        System.out.println("\n______________________\n");
        System.out.println(numbers.poll());//retrieves and removes first element
        System.out.println(numbers);
        System.out.println(numbers.pollFirst());
        System.out.println(numbers);
        System.out.println(numbers.pollLast());
        System.out.println(numbers);

        System.out.println("___________________________");
        numbers.push(5.7);
        System.out.println(numbers);//add object to the zro index
        numbers.push(8.9);
        System.out.println(numbers);
        System.out.println(numbers.pop());//removes the object from the zero index
        System.out.println(numbers);
    }

}
