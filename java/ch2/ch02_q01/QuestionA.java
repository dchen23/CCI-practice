package ch02_q01;

import CCILibrary.LinkedListNode;

import java.util.HashSet;

public class QuestionA {

    public static void deleteDups(LinkedListNode head) {

        HashSet<Integer> dup = new HashSet<>();
        LinkedListNode prev = new LinkedListNode();

        do {
            if (dup.contains(head.data)) {
                prev.next = head.next;
            }
            else {
                dup.add(head.data);
                prev = head;
            }
            head = head.next;
        } while (head != null);

    }

    public static void main(String[] args) {
        LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        LinkedListNode head = first;
        LinkedListNode second;
        for (int i = 1; i < 8; i++) {
            second = new LinkedListNode(i % 2, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        System.out.println(head.printForward());
        deleteDups(head);
        System.out.println(head.printForward());
    }
}
