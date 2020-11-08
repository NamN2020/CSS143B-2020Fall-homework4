package Problem3;
/*
    Nam Nguyen
    November 7, 2020
    CSS 143B
    Homework 4
 */
import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        // homework
        if(list == null){
            return;
        }
        if(list.next != null){
            printListInReverse(list.next, print);
        }
        print.println(list.val);
    }
}
