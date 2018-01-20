package ch02_q03;

import CCILibrary.AssortedMethods;
import CCILibrary.LinkedListNode;

public class Question {

    public static void deleteNode(LinkedListNode node, LinkedListNode head) {
        if(node == null || node.next == null || node == head) {
            return;
        }

        LinkedListNode next = node.next;
        node.data = next.data;
        node.next = next.next;
    }

    public static void main(String[] args) {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println(head.printForward());
        deleteNode(head.next.next.next.next, head); // delete node 4
        System.out.println(head.printForward());
    }
}
