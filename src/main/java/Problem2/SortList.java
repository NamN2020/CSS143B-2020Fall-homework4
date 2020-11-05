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
        /*
            Partial credit:
            My thought process for findMidAndBreak is using recursion to find the depth of the list and put it in a int
            variable. To find the middle of the list I'd take the depth / 2. I know the idea is to make the last node of
            the first list and point it to null, but I don't know how to get to that specific node.
         */

        if(head.next == null){
            return head;
        }

        findMidAndBreak(head.next);

        return head;
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        // homework
        return null;
    }
}
