package ch02_q04;

import CCILibrary.LinkedListNode;

public class Question {

    public static LinkedListNode partition(LinkedListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListNode right = new LinkedListNode(0, null, null);
        LinkedListNode left = new LinkedListNode(0, null, null);
        LinkedListNode record = left;
        LinkedListNode re = right;

        while (head != null) {
            if (head.data < x) {
                right.next = new LinkedListNode(head.data, null, right);
                right = right.next;
            }
            else {
                left.next = new LinkedListNode(head.data, null, left);
                left = left.next;
            }

            head = head.next;
        }

        right.next = record.next;

        return re.next;
    }

    public static void main(String[] args) {
        int[] vals = {33,9,2,3,10,10389,838,874578,5};
        LinkedListNode head = new LinkedListNode(vals[0], null, null);
        LinkedListNode current = head;
        for (int i = 1; i < vals.length; i++) {
            current = new LinkedListNode(vals[i], null, current);
        }
        System.out.println(head.printForward());

        /* Partition */
        LinkedListNode h = partition(head, 838);

        /* Print Result */
        System.out.println(h.printForward());
    }
}
