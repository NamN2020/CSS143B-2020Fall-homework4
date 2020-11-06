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
        if(head == null || head.next == null){
            return null;
        }

        ListNode temp = head.next;
        int length = getCount(head);
        int mid = length / 2;
        for(int t = 1; t < mid; t ++){
            temp = temp.next;
        }
        for(int i = 1; i < mid; i ++){
            head = head.next;
        }
        head.next = null;

        return temp;
    }

    // https://www.geeksforgeeks.org/find-length-of-a-linked-list-iterative-and-recursive/
    // get length of linked list
    public static int getCount(ListNode head){
        if(head == null){
            return 0;
        }
        return 1 + getCount(head.next);
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        // homework
        // base case
        if(list1.next == null){
            return null;
        } else if(list2.next == null){
            return null;
        }

        if(list1.val > list2.val){
            list1 = list1.next;
        } else if(list1.val < list2.val){
            list2 = list2.next;
        }
        return mergeLists(list1, list2);
    }
}
