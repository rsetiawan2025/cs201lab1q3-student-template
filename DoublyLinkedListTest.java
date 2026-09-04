public class DoublyLinkedListTest {

    public static void main(String[] args) {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.addLast(1);
        list.addLast(null);
        list.addLast(2);

        System.out.println("Before Group :");
        System.out.println("Linked List : " + list);
        System.out.println("First Element : " + list.first());
        System.out.println("Last Element : " + list.last());

        list.group();

        System.out.println("\nAfter Group :");
        System.out.println("Linked List : " + list);
        System.out.println("First Element : " + list.first());
        System.out.println("Last Element : " + list.last());

        System.out.println("\n------------------------");

        list = new DoublyLinkedList<>();

        list.addLast(4);
        list.addLast(null);
        list.addLast(1);
        list.addLast(null);
        list.addLast(3);

        System.out.println("\nBefore Group :");
        System.out.println("Linked List : " + list);
        System.out.println("First Element : " + list.first());
        System.out.println("Last Element : " + list.last());

        list.group();

        System.out.println("\nAfter Group :");
        System.out.println("Linked List : " + list);
        System.out.println("First Element : " + list.first());
        System.out.println("Last Element : " + list.last());
    }
}