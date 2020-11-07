package Problem2;

/*
    Nam Nguyen
    November 5, 2020
    CSS 143B
    Homework 4
 */
public class SortList {
    private static final int SENTRY = Integer.MAX_VALUE;
    // DO NOT ADD ANY NEW MEMBER VARIABLE AND MEMBER FUNCTION

    // DO NOT CHANGE ANYTHING IN THIS FUNCTION
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode mid = findMidAndBreak(head);
        return mergeLists(sortList(head), sortList(mid));
    }

    public static ListNode findMidAndBreak(ListNode head) {
        // homework
        if (head == null || head.next == null) {
            return null;
        }

        ListNode list2Head = head.next;
        int length = getCount(head);
        int mid = length / 2;

        // finding start of second list
        for (int t = 1; t < mid; t++) {
            list2Head = list2Head.next;
        }
        // finding end of first list
        for (int i = 1; i < mid; i++) {
            head = head.next;
        }
        head.next = null;

        return list2Head;
    }

    // https://www.geeksforgeeks.org/find-length-of-a-linked-list-iterative-and-recursive/
    // get length of linked list
    public static int getCount(ListNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + getCount(node.next);
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        // homework
        // base case
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1 == null && list2 == null) {
            return null;
        }

        ListNode node = new ListNode();

        if (list1.val < list2.val) {
            list1.next = mergeLists(list1.next, list2);
            node = list1;
        } else {
            list2.next = mergeLists(list1, list2.next);
            node = list2;
        }

        return node;
    }
}
