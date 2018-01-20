package ch02_q02;

import CCILibrary.AssortedMethods;
import CCILibrary.LinkedListNode;

public class Question {

    public static void printKthToLast(LinkedListNode head, int index) {
        LinkedListNode ln = head;
        for (int i = 0; i < index; i++) {
            head = head.next;
            if (head == null) {
                return;
            }
        }

        if (head == null) {
            System.out.println(ln.data);
            return;
        }

        while(head.next != null) {
            head = head.next;
            ln = ln.next;
        }

        System.out.println(ln.data);
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(array);
        for (int i = 0; i <= array.length + 1; i++) {
            printKthToLast(head, i);
        }
    }
}
